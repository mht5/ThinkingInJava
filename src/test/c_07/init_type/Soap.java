package test.c_07.init_type;

public class Soap {
	private String s;
	
	public Soap(){
		System.out.println("soap()");
		s="constructed.";
	}
	
	public String toString(){
		return s;
	}
}
