package test.c_18.buffered_input_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 使用BufferedReader读取文件，提供了缓冲
 * @author mohan
 *
 */
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
//		将FileReader的引用传递给BufferedReader
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb=new StringBuilder();
		while((s=in.readLine())!=null){
			sb.append(s+"\n");
		}
//		使用完毕后关闭文件
		in.close();
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println(read("题都城南庄.txt"));
	}
}
