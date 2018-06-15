package test.c_08.music_test3;

public class Percussion extends Instrument{
	public void play(Note n){
		adjust();
		System.out.println("Percussion.play("+n+")");
	}
	
	public String what(){
		return "Percussion";
	}
	
	public void adjust(){
		System.out.println("Adjusting percussion.");
	}
}
