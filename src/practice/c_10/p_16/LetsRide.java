package practice.c_10.p_16;

public class LetsRide {
	public static Cycle getCycle(CycleFactory fact){
		return (fact.getCycle());
	}
	
	public static void doRide(Cycle c){
		c.ride();
	}
	
	public static void main(String[] args){
		doRide(getCycle(Unicycle.factory));
		doRide(getCycle(Bicycle.factory));
		doRide(getCycle(Tricycle.factory));
	}
}
