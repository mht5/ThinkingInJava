package practice.c_10.p_10;

public class Outer {
	public static void getIOuter(boolean b){
		if(b){
			class Inner implements IOuter{
				@Override
				public void printInfo() {
					System.out.println(getClass().getSimpleName());
				}
			}
			new Inner().printInfo();
		}
	}
	
	public static void main(String[] args){
		getIOuter(true);
	}
}
