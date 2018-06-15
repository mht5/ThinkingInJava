package practice.c_13.p_09;

public class Splitting {
	private static String s="Then, when you have found the shrubbery, you must cut down the mightest tree in the forest... with... a herring";
	
	public static void replacing(){
		System.out.println(s.replaceAll("a|e|i|o|u", "_"));
	}
	
	public static void main(String[] args){
		replacing();
	}
}
