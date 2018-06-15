package test.c_04.if_else;

public class IfElse {
	public static void main(String[] args){
		test(6);
		test(12);
		test(10);
	}
	
	static void test(int i){
		if(i>10){
			System.out.println(i+" is bigger than 10.");
		}
		else if(i<10){
			System.out.println(i+" is lesser than 10.");
		}
		else{
			System.out.println(i+" is equal to 10.");
		}
	}
}
