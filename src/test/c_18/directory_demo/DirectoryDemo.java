package test.c_18.directory_demo;

import java.io.File;

import util.Directory;
import util.PPrint;

/**
 * 使用Directory类打印信息
 * @author mohan
 *
 */
public class DirectoryDemo {
	public static void main(String[] args){
		PPrint.pPrint(Directory.walk(".").dirs);
		System.out.println("====================");
		for(File file : Directory.local(".",".*")){
			System.out.println(file);
		}
		System.out.println("====================");
		for(File file : Directory.walk(".", "D.*\\.java")){
			System.out.println(file);
		}
		System.out.println("====================");
		for(File file : Directory.walk(".", "D.*\\.class")){
			System.out.println(file);
		}
	}
}
