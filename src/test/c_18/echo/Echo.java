package test.c_18.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ڿ���̨��ӡ�����ÿһ������
 * ʹ��InputStreamReader��System.in��װ��Reader���ٰ�װ��BufferedReader
 * @author mohan
 *
 */
public class Echo {
	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(
				new InputStreamReader(System.in));
		String s;
		while((s=in.readLine())!=null&&s.length()!=0){
			System.out.println(s);
		}
	}
}
