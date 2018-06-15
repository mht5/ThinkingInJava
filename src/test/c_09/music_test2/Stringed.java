package test.c_09.music_test2;

public class Stringed implements Instrument{
	public void play(Note n){
		adjust();
		System.out.println("Stringed.play("+n+")");
	}
	
	public String toString(){
		return "Stringed";
	}
	
	public void adjust(){
		System.out.println("Adjusting stringed.");
	}
}
