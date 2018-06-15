package test.c_13.test_regular_Expresion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpresion {
	public static void main(String[] args){
		/**
		 * 常用调用
		 * 非线程安全
		 */
		Pattern p1=Pattern.compile("a*b");
		
		String s1="aaaab";
		Matcher m1=p1.matcher(s1);	
		System.out.println(m1.matches());
		
		String s2="a";
		Matcher m2=p1.matcher(s2);
		System.out.println(m2.matches());
		
		/**
		 * 单次调用
		 * 线程安全
		 */
		System.out.println(Pattern.matches("a*b", "aaaab"));
		
		/**
		 * 获取正则表达式
		 */
		System.out.println(p1.pattern());
		
		/**
		 * Pattern的split方法
		 */
		String s3="rrrrrrraabcccccccaab";
		for(String s : p1.split(s3)){
			System.out.println(s+"____");
		}
	}
}
