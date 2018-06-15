package practice.c_05.p_19;

public class Tester {
	static void f(String... args){
		for(String x : args){
			System.out.print(x+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		f("sam","jack","jon");
		f(new String[]{"sam","jon","jack"});
	}
}
