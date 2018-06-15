package test.c_10.callbacks;

public class MyIncreament {
	public void increament(){
		System.out.println("Other operation");
	}
	
	public static void f(MyIncreament mi){
		mi.increament();
	}
}
