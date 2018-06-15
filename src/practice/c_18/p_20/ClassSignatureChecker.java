package practice.c_18.p_20;

import java.io.File;
import java.io.IOException;

import util.BinaryFile;
import util.Directory;

/**
 * 使用Directory和BinaryFile类来验证某个目录树下所有.class文件都是以十六进制字符"ca fe ba be"开头的
 * "ca fe ba be"这个四个字节是用来标识class文件的，虚拟机加载class文件的时候会先检查这四个字节，如果不是"ca fe ba be"则虚拟机拒绝加载该文件
 * @author mohan
 *
 */
public class ClassSignatureChecker {
	final static byte[] signature={(byte)202,(byte)254,(byte)186,(byte)190};
	
	public static void main(String[] args) throws IOException{
		String dir=".";
		if(args.length==1){
			dir=args[0];
		}
		boolean flag=true;
		for(File file : Directory.walk(dir,".*\\.class")){
			System.out.println(file);
			byte[] bt=BinaryFile.read(file);
			for(int i=0;i<signature.length;i++){
				if(bt[i]!=signature[i]){
					flag=false;
					System.out.println(file+" is corrupted!");
					break;
				}
			}
		}
		if(flag){
			System.out.println(signature);
			System.out.println("all good.");
		}
	}
}
