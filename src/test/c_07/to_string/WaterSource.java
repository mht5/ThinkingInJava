package test.c_07.to_string;

public class WaterSource {
	private String s;
	
	public WaterSource(){
		System.out.println("watersource()");
		s="constructed.";
	}
	
	public String toString(){
		return s;
	}
}
