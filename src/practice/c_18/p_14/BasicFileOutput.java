package practice.c_18.p_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import practice.c_18.p_08.ReadFile;

/**
 * 基本的文件输出
 * 数据量较大时使用缓冲效率较高，数据量小时不使用缓冲效率更高。
 * 使用快捷方式创建的输出效率更高(both situation)？
 * @author mohan
 *
 */
public class BasicFileOutput {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		获取数据
	    List<String> list = ReadFile.read("do not go gentle into that good night.txt"); 
	    
//	    CASE1
//		输出数据
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		int lineCount=1;
//		将数据输出到文件
		long t1=System.currentTimeMillis();
		for(String s : list){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ + ": "+s);
			}
		}
//		关闭文件
		out.close();
		long t2=System.currentTimeMillis();
		System.out.println("buffered: "+(t2-t1));

//		CASE2
//		输出数据
		out=new PrintWriter(
						new FileWriter(file));
		lineCount=1;
//		将数据输出到文件
		t1=System.currentTimeMillis();
		for(String s : list){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ + ": "+s);
			}
		}
//		关闭文件
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("unbuffered: "+(t2-t1));

//		CASE3
//		输出数据
		out=new PrintWriter(file);
		lineCount=1;
//		将数据输出到文件
		t1=System.currentTimeMillis();
		for(String s : list){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ + ": "+s);
			}
		}
//		关闭文件
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("using shortcut: "+(t2-t1));
		
//		删除文件
		(new File(file)).delete();
	}
}