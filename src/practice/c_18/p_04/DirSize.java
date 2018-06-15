package practice.c_18.p_04;

import java.io.File;
import java.util.List;

import util.Directory;

/**
 * 使用Directory类计算目录下符合条件的文件总大小
 * @author mohan
 *
 */
public class DirSize {
	public static void main(String[] args){
		List<File> files=Directory.walk(".","D.*\\.java").files;
		long total=0;
		long fs;
		for(File file : files){
			fs=file.length();
			System.out.println(file+": "+fs+" byte(s)");
			total+=fs;
		}
		System.out.println("===================");
		System.out.println("Total: "+total+" byte(s)");
	}
}
