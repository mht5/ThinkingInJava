package practice.c_11.p_01;

public class Gerbil {
	private static long counter;
	private final long id=counter++;
	
	public void hop(){
		System.out.println("Hopping: "+id);
	}
}
