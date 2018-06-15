package practice.c_13.p_01;

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
