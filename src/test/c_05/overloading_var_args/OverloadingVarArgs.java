package test.c_05.overloading_var_args;

public class OverloadingVarArgs {
	static void f(char... args){
		for(char x : args){
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

	static void f(String... args){
		for(String x : args){
			System.out.print(x+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f('a','b','c');
		f(1,2,3);
		f("sam","jack");
//		f();
	}
}
