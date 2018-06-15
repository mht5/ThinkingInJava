package test.c_05.auto_boxing_var_args;

public class AutoBoxingVarArgs {
	static void f(Integer... args){
		for(Integer x : args){
			System.out.print(x+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f(1,2,3);
		f(1,new Integer(12),23);
		f(new Integer(12),new Integer(24),new Integer(36));
	}
}
