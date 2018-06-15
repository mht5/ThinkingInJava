package practice.c_18.p_14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import practice.c_18.p_08.ReadFile;

/**
 * �������ļ����
 * �������ϴ�ʱʹ�û���Ч�ʽϸߣ�������Сʱ��ʹ�û���Ч�ʸ��ߡ�
 * ʹ�ÿ�ݷ�ʽ���������Ч�ʸ���(both situation)��
 * @author mohan
 *
 */
public class BasicFileOutput {
	private static String file="BasicFileOutput.txt";
	
	public static void main(String[] args) throws IOException{
//		��ȡ����
	    List<String> list = ReadFile.read("do not go gentle into that good night.txt"); 
	    
//	    CASE1
//		�������
		PrintWriter out=new PrintWriter(
				new BufferedWriter(
						new FileWriter(file)));
		int lineCount=1;
//		������������ļ�
		long t1=System.currentTimeMillis();
		for(String s : list){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ + ": "+s);
			}
		}
//		�ر��ļ�
		out.close();
		long t2=System.currentTimeMillis();
		System.out.println("buffered: "+(t2-t1));

//		CASE2
//		�������
		out=new PrintWriter(
						new FileWriter(file));
		lineCount=1;
//		������������ļ�
		t1=System.currentTimeMillis();
		for(String s : list){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ + ": "+s);
			}
		}
//		�ر��ļ�
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("unbuffered: "+(t2-t1));

//		CASE3
//		�������
		out=new PrintWriter(file);
		lineCount=1;
//		������������ļ�
		t1=System.currentTimeMillis();
		for(String s : list){
			for(int i=0;i<100000;i++){
				out.println(lineCount++ + ": "+s);
			}
		}
//		�ر��ļ�
		out.close();
		t2=System.currentTimeMillis();
		System.out.println("using shortcut: "+(t2-t1));
		
//		ɾ���ļ�
		(new File(file)).delete();
	}
}