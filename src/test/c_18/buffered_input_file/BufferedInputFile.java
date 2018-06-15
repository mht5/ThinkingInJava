package test.c_18.buffered_input_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ʹ��BufferedReader��ȡ�ļ����ṩ�˻���
 * @author mohan
 *
 */
public class BufferedInputFile {
	public static String read(String filename) throws IOException{
//		��FileReader�����ô��ݸ�BufferedReader
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb=new StringBuilder();
		while((s=in.readLine())!=null){
			sb.append(s+"\n");
		}
//		ʹ����Ϻ�ر��ļ�
		in.close();
		return sb.toString();
	}
	
	public static void main(String[] args) throws IOException{
		System.out.println(read("�ⶼ����ׯ.txt"));
	}
}
