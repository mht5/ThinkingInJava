package test.c_18.file_output_shortcut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import test.c_18.buffered_input_file.BufferedInputFile;

/**
 * �ı��ļ�����Ŀ�ݷ�ʽ
 * Java SE5��PrintWriter�������һ����������������ÿ��ϣ�������ı���������д��ʱ������ִ�����е�װ�ι���
 * ҪΪout��ʾ����close()�������Ϊ��������ļ�����close()���ͻᷢ�ֻ��������ݲ��ᱻˢ����գ���ô���Ǿͻ᲻����
 * @author mohan
 *
 */
public class FileOutputShortcut {
	private static String file="FileOutputShortcut.txt";
	
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(
				new StringReader(
						BufferedInputFile.read("�ⶼ����ׯ.txt")));
//		�����ǿ�ݷ�ʽ
		PrintWriter out=new PrintWriter(file);
		int lineCount=1;
		String s;
		while((s=in.readLine())!=null){
			out.println(lineCount++ +": "+s);
		}
		in.close();
//		������Ҫ�ӣ�����
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
