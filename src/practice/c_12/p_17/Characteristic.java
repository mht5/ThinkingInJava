package practice.c_12.p_17;

public class Characteristic {
	public Characteristic(String s){
		System.out.println("Creating characteristic "+s);
	}
	
	protected void dispose(){
		System.out.println("disposing characteristic");
	}
}
