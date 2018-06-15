package test.c_13.integer_match;

public class IntegerMatch {
	public static void main(String[] args){
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("1234".matches("-?\\d+"));
		System.out.println("+1234".matches("-?\\d+"));
		System.out.println("+12324".matches("\\+?\\d"));
		System.out.println("+1234".matches("(-|\\+)?\\d+"));
	}
}
