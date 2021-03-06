package practice.c_18.p_06;

import java.io.File;
import java.io.IOException;

import util.Directory;

/**
 * 使用Strategy来处理目录下的文件(策略模式)
 * 查找在某个特定日期之后修改的文件
 * @author mohan
 *
 */
public class ProcessFiles {
	public interface Strategy{
		void process(File file);
	}
	private Strategy strategy;
	private String ext;
	public ProcessFiles(Strategy strategy, String ext){
		this.strategy=strategy;
		this.ext=ext;
	}
	public void start(String[] args){
		try{
			if(args.length==0){
				processDirectoryTree(new File("."));
			}
			else{
				for(String arg : args){
					File fileArg=new File(arg);
					if(fileArg.isDirectory()){
						processDirectoryTree(fileArg);
					}
					else{
						if(!arg.endsWith("."+ext)){
							arg+="."+ext;
						}
						strategy.process(new File(arg).getCanonicalFile());
					}
				}
			}
		}catch(IOException e){
			throw new RuntimeException(e);
		}
	}
	public void processDirectoryTree(File root) throws IOException{
		for(File file : Directory.walk(root.getAbsolutePath(), ".*\\."+ext)){
			strategy.process(file.getCanonicalFile());
		}
	}
//	查找24小时内修改的文件
	private static long time=System.currentTimeMillis()-(1000*60*60*24);
	public static void main(String[] args){
		new ProcessFiles(new ProcessFiles.Strategy() {
			public void process(File file) {
				if(file.lastModified()>time){
					System.out.println(file+": "+file.lastModified());
				}
			}
		}, "java").start(args);
	}
}
