package practice.c_08.p_17;

public class LetsRide {
	public static void doRide(Cycle c){
		c.ride();
	}
	
	public static void balance(Cycle c){
		c.balance();
	}
	
	public static void main(String[] args){
		Cycle u=new Unicycle();
		Cycle b=new Bicycle();
		Cycle t=new Tricycle();
		Cycle[] c={u,b,t};
		for(Cycle cycle : c){
			balance(cycle);
		}
		u=(Unicycle)(u);
		b=(Bicycle)(b);
		t=(Tricycle)(t);
		balance(u);
		balance(b);
		balance(t);
	}
}
