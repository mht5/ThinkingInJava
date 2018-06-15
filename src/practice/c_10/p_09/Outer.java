package practice.c_10.p_09;

public class Outer {
	public static IOuter getIOuter(){
		class Inner implements IOuter{
			@Override
			public void printInfo() {
				System.out.println(getClass().getSimpleName());
			}
		}
		return (new Inner());
	}
	
	public static void main(String[] args){
		getIOuter().printInfo();
	}
}
