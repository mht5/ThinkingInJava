package practice.c_08.p_05;

public class Tricycle extends Cycle{
	public void ride(){
		int i=wheels();
		System.out.println("Tricycle.ride("+i+")");
	}
	
	public int wheels(){
		return 3;
	}
}
