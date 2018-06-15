package test.c_09.music_test2;

public class Percussion implements Instrument{
	public void play(Note n){
		adjust();
		System.out.println("Percussion.play("+n+")");
	}
	
	public String toString(){
		return "Percussion";
	}
	
	public void adjust(){
		System.out.println("Adjusting percussion.");
	}
}
