package practice.c_21.p_02;

public class Test {
	public static void main(String[] args){
		for(int i=1; i<=7; i++){
			new Thread(new Fibonacci(i)).start();
		}
	}
}
