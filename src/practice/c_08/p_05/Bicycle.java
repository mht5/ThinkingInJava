package practice.c_08.p_05;

public class Bicycle extends Cycle{
	public void ride(){
		int i=wheels();
		System.out.println("Bicycle.ride("+i+")");
	}
	
	public int wheels(){
		return 2;
	}
}
