package test.c_18.basic_file_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * �������ļ����
 * @author mohan
 *
 */
public class BasicFileOutput {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		��ȡ����
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
//		�������
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		int lineCount=1;
		String s;
//		������������ļ�
		while((s=in.readLine())!=null){
			out.println(lineCount++ +": "+s);
		}
//		�ر��ļ�
		in.close();
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}