package practice.c_10.p_01;

public class Outer {
	static class Inner{
		public Inner(){
			System.out.println("Inner constructor.");
		}
	}
	
	public static void getIn(){
		System.out.println((new Inner()).toString());
	}
	
	public static void main(String[] args){
		getIn();
	}
}
