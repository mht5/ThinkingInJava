package practice.c_08.p_05;

public class Unicycle extends Cycle{
	public void ride(){
		int i=wheels();
		System.out.println("Unicycle.ride("+i+")");
	}
	
	public int wheels(){
		return 1;
	}
}
