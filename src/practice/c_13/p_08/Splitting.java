package practice.c_13.p_08;

import java.util.Arrays;

public class Splitting {
	private static String s="Then, when you have found the shrubbery, you must cut down the mightest tree in the forest... with... a herring";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(s.split(regex)));
	}
	
	public static void main(String[] args){
		split("the|you");
	}
}
