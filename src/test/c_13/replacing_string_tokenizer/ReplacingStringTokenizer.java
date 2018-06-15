package test.c_13.replacing_string_tokenizer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 三种分割字符串方法
 * @author mohan
 *
 */
public class ReplacingStringTokenizer {
	public static void main(String[] args){
		String s1="Do not go gentle into that good night.";
		String s2="Do.not.go.gentle.into.that.good.night.";
		StringTokenizer st=new StringTokenizer(s1);
		while(st.hasMoreTokens()){
			System.out.print(st.nextElement()+" ");
		}
		System.out.println();
		
		st=new StringTokenizer(s2,".");
		while(st.hasMoreTokens()){
			System.out.print(st.nextElement()+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(s1.split(" ")));
		
		Scanner sc=new Scanner(s1);
		while(sc.hasNext()){
			System.out.print(sc.next()+" ");
		}
		System.out.println();
		
		sc=new Scanner(s2);
		sc.useDelimiter(".");
		while(sc.hasNext()){
			System.out.print(sc.next()+" ");
		}
	}
}
