package practice.c_18.p_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �ڿ���̨��ӡ�����ÿһ�����ݣ�ת��Ϊ��д��
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
			System.out.println(s.toUpperCase());
		}
	}
}
