package practice.c_18.p_14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * �������ļ����
 * �������ϴ�ʱʹ�û���Ч�ʽϸߣ�������Сʱ��ʹ�û���Ч�ʸ��ߡ�
 * ʹ�ÿ�ݷ�ʽ���������Ч�ʸ���(both situation)��
 * @author mohan
 *
 */
public class BasicFileOutput1 {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		��ȡ����
//		��һ��caseʱҪ����BufferedReader����Ȼin�Ѿ�ָ�������һ��Ԫ�أ������ٶ�ȡ���ݣ���ɴ���
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
		
//		CASE1
//		�������
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		int lineCount=1;
		String s;
//		������������ļ�
		long t1=System.currentTimeMillis();
		while((s=in.readLine())!=null){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ +": "+s);
			}
		}
//		�ر��ļ�
		in.close();
		out.close();
		long t2=System.currentTimeMillis();
		System.out.println("buffered: "+(t2-t1));

//		CASE2
//		�������
		out=new PrintWriter(new FileWriter(file));
		in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
		lineCount=1;
//		������������ļ�
		t1=System.currentTimeMillis();
		while((s=in.readLine())!=null){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ +": "+s);
			}
		}
//		�ر��ļ�
		in.close();
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("unbuffered: "+(t2-t1));

//		CASE3
//		�������
		out=new PrintWriter(file);
		in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("do not go gentle into that good night.txt")));
		lineCount=1;
//		������������ļ�
		t1=System.currentTimeMillis();
		while((s=in.readLine())!=null){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ +": "+s);
			}
		}
//		�ر��ļ�
		in.close();
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("using shortcut: "+(t2-t1));
//		ɾ���ļ�
//		(new File(file)).delete();
	}
}