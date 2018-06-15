package test.c_05.overloading_var_args;

public class OverloadingVarArgs1 {
	static void f(char c, Integer... args){
		System.out.print(c+": ");
		for(Integer x : args){
			System.out.print(x+"  ");
		}
		System.out.println();
	}
	
	static void f(Integer... args){
		for(Integer x : args){
			System.out.print(x+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f('x',1,2,3);
		f(1,2,3);
	}
}
