package test.c_04.if_else_again;

public class IfElse {
	public static void main(String[] args){
		System.out.println(test(6));
		System.out.println(test(12));
		System.out.println(test(10));
	}
	
	static String test(int i){
		if(i>10){
			return (i+" is bigger than 10.");
		}
		else if(i<10){
			return (i+" is lesser than 10.");
		}
		else{
			return (i+" is equal to 10.");
		}
	}
}
