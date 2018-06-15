package practice.c_18.p_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 在控制台打印输入的每一行内容（转换为大写）
 * 使用InputStreamReader将System.in包装成Reader，再包装成BufferedReader
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
