package test.c_08.frog;

public class Characteristic {
	public Characteristic(String s){
		System.out.println("Creating characteristic "+s);
	}
	
	protected void dispose(){
		System.out.println("disposing characteristic");
	}
}
