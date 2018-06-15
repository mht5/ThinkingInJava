package test.c_09.music_test1;

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
