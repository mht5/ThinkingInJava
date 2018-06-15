package test.c_08.music_test3;

public class Instrument {
	public void play(Note n){
		adjust();
		System.out.println("Instrument.play("+n+")");
	}
	
	public String what(){
		return "Instrument";
	}
	
	public void adjust(){
		System.out.println("Adjusting instrument.");
	}
}
