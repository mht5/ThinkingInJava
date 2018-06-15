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
 * 通过System.setIn(), System.setOut(), System.setErr()将in, out和err重定向到文件中
 * @author mohan
 *
 */
public class Redirecting {
	public static void main(String[] args) throws IOException{
//		取得对System.out的引用
		PrintStream console=System.out;
		BufferedInputStream in=new BufferedInputStream(
				new FileInputStream("do not go gentle into that good night.txt"));
		PrintStream out=new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("redirecting.dat")));
//		这里是重定向
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
//		将系统输出恢复到System.out
		System.setOut(console);
		System.out.println(BufferedInputFile.read("redirecting.dat"));
	}
}
