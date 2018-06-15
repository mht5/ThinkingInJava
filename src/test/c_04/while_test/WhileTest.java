package test.c_04.while_test;

public class WhileTest {
	public static void main(String[] args){
		while(condition()){
			System.out.println("in while.");
		}
		System.out.println("out.");
	}
	
	static boolean condition(){
		boolean bool=Math.random()<0.99;
		System.out.print(bool+", ");
		return bool;
	}
}
