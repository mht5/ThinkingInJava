package practice.c_18.p_13;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 基本的文件输出
 * 使用LinenumberReader重写BasicFileOutput
 * @author mohan
 *
 */
public class BasicFileOutput {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		获取数据
//		LineNumberReader是从BufferedReader继承的
		LineNumberReader in=new LineNumberReader(
				new FileReader("do not go gentle into that good night.txt"));
//		输出数据
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		String s;
//		将数据输出到文件
		while((s=in.readLine())!=null){
			out.println(in.getLineNumber()+": "+s);
		}
//		关闭文件
		in.close();
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}