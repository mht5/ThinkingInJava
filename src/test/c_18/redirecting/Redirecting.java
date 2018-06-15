package test.c_18.redirecting;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * ͨ��System.setIn(), System.setOut(), System.setErr()��in, out��err�ض����ļ���
 * @author mohan
 *
 */
public class Redirecting {
	public static void main(String[] args) throws IOException{
//		ȡ�ö�System.out������
		PrintStream console=System.out;
		BufferedInputStream in=new BufferedInputStream(
				new FileInputStream("do not go gentle into that good night.txt"));
		PrintStream out=new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("redirecting.dat")));
//		�������ض���
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			System.out.println(s);
			System.err.println(s);
		}
		out.close();
//		��ϵͳ����ָ���System.out
		System.setOut(console);
		System.out.println(BufferedInputFile.read("redirecting.dat"));
	}
}
