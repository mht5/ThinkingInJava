package test.c_07.inherit_overloading;

public class Homer {
	public char doh(char c){
		System.out.println("doh(char)");
		return c;
	}
	
	public float doh(float f){
		System.out.println("doh(float)");
		return f;
	}
}
