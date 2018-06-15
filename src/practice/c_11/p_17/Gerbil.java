package practice.c_11.p_17;

public class Gerbil {
	private String name;
	private static long counter;
	private final long id=counter++;
	
	public Gerbil(String name){
		this.name=name;
	}
	
	public void hop(){
		System.out.println("Hopping: "+id);
	}
}
