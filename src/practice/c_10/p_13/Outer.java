package practice.c_10.p_13;

public class Outer {
	public static IOuter getIOuter(){
		return new IOuter(){
			public void printInfo() {
				System.out.println("IOuterImpl.");
			}
		};
	}
	
	public static void main(String[] args){
		getIOuter().printInfo();
	}
}
