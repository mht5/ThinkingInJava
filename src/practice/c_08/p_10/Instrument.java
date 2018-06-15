package practice.c_08.p_10;

public class Instrument {
	public void play(Note n){
		adjust();
		System.out.println("Instrument.play("+n+")");
	}
	
	public void adjust(){
		System.out.println("Adjusting instrument.");
	}
}
