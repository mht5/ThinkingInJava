package practice.c_08.p_17;

public class Cycle {
	public void ride(){
		int i=wheels();
		System.out.println("Cycle.ride("+i+")");
		balance();
	}
	
	public int wheels(){
		return 0;
	}
	
	public void balance(){
		System.out.println("Cycle.balance()");
	}
}
