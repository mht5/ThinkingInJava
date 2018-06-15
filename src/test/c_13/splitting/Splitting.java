package test.c_13.splitting;

import java.util.Arrays;

public class Splitting {
	private static String s="Then, when you have found the shrubbery, you must cut down the mightest tree in the forest... with... a herring";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(s.split(regex)));
	}
	
	public static void replacing(){
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
	
	public static void main(String[] args){
		split(" ");
//		筛选出非单词字符，\w指单词字符
		split("\\W+");
//		筛选出以'n'开头的非字母字符
		split("n\\W+");
		replacing();
	}
}
