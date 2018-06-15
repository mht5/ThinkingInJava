package test.c_05.simple_constructor;

public class SimpleConstructor {
	public static void main(String[] args){
		for(int i=10;i>0;i--){
			new Human();
			new Human("count down to "+i);
		}
	}
}
