package practice.c_18.p_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * 基本的文件输出
 * 数据量较大时使用缓冲效率较高，数据量小时不使用缓冲效率更高。
 * 使用快捷方式创建的输出效率更高(both situation)？
 * @author mohan
 *
 */
public class BasicFileOutput1 {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		获取数据
//		下一个case时要重置BufferedReader，不然in已经指向了最后一个元素，不会再读取数据，造成错误
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
		
//		CASE1
//		输出数据
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		int lineCount=1;
		String s;
//		将数据输出到文件
		long t1=System.currentTimeMillis();
		while((s=in.readLine())!=null){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ +": "+s);
			}
		}
//		关闭文件
		in.close();
		out.close();
		long t2=System.currentTimeMillis();
		System.out.println("buffered: "+(t2-t1));

//		CASE2
//		输出数据
		out=new PrintWriter(new FileWriter(file));
		in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
		lineCount=1;
//		将数据输出到文件
		t1=System.currentTimeMillis();
		while((s=in.readLine())!=null){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ +": "+s);
			}
		}
//		关闭文件
		in.close();
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("unbuffered: "+(t2-t1));

//		CASE3
//		输出数据
		out=new PrintWriter(file);
		in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
		lineCount=1;
//		将数据输出到文件
		t1=System.currentTimeMillis();
		while((s=in.readLine())!=null){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ +": "+s);
			}
		}
//		关闭文件
		in.close();
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("using shortcut: "+(t2-t1));
//		删除文件
//		(new File(file)).delete();
	}
}