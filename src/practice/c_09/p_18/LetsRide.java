package practice.c_09.p_18;

public class LetsRide {
	public static Cycle getCycle(CycleFactory fact){
		return (fact.getCycle());
	}
	
	public static void doRide(Cycle c){
		c.ride();
	}
	
	public static void main(String[] args){
		doRide(getCycle(new UnicycleFactory()));
		doRide(getCycle(new BicycleFactory()));
		doRide(getCycle(new TricycleFactory()));
	}
}
