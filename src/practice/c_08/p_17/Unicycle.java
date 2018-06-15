package practice.c_08.p_17;

public class Unicycle extends Cycle{
	public void ride(){
		int i=wheels();
		System.out.println("Unicycle.ride("+i+")");
	}
	
	public int wheels(){
		return 1;
	}
	
	public void balance(){
		System.out.println("Unicycle.balance()");
	}
}
