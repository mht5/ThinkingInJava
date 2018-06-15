package test.c_13.rudolph;

public class Rudolph {
	public static void main(String[] args){
		for(String s : new String[]{"Rudolph","[rR]udolph","[rR][aeiou]d.*","R.*"}){
			System.out.println("Rudolph".matches(s));
		}
	}
}
