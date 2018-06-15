package test.c_13.immutable;

public class Immutable {
	public static String upper(String s){
		return s.toUpperCase();
	}
	
	public static void main(String[] args){
		String s="Howdy";
		System.out.println(s);
		String ss=upper(s);
		System.out.println(ss);
		System.out.println(s);
	}
}
