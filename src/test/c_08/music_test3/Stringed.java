package test.c_08.music_test3;

public class Stringed extends Instrument{
	public void play(Note n){
		adjust();
		System.out.println("Stringed.play("+n+")");
	}
	
	public String what(){
		return "Stringed";
	}
	
	public void adjust(){
		System.out.println("Adjusting stringed.");
	}
}
