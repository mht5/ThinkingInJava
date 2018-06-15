package practice.c_18.p_13;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * �������ļ����
 * ʹ��LinenumberReader��дBasicFileOutput
 * @author mohan
 *
 */
public class BasicFileOutput {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		��ȡ����
//		LineNumberReader�Ǵ�BufferedReader�̳е�
		LineNumberReader in=new LineNumberReader(
				new FileReader("do not go gentle into that good night.txt"));
//		�������
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		String s;
//		������������ļ�
		while((s=in.readLine())!=null){
			out.println(in.getLineNumber()+": "+s);
		}
//		�ر��ļ�
		in.close();
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}