package test.c_18.basic_file_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 基本的文件输出
 * @author mohan
 *
 */
public class BasicFileOutput {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		获取数据
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
//		输出数据
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		int lineCount=1;
		String s;
//		将数据输出到文件
		while((s=in.readLine())!=null){
			out.println(lineCount++ +": "+s);
		}
//		关闭文件
		in.close();
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}