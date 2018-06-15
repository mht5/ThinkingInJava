package practice.c_08.p_01;

public class LetsRide {
	public static void doRide(Cycle c){
		c.ride();
	}
	
	public static void main(String[] args){
		doRide(new Unicycle());
		doRide(new Bicycle());
		doRide(new Tricycle());
	}
}
