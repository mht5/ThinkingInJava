package test.c_08.music_test3;

public class Wind extends Instrument{
	public void play(Note n){
		adjust();
		System.out.println("Wind.play("+n+")");
	}
	
	public String what(){
		return "Wind";
	}
	
	public void adjust(){
		System.out.println("Adjusting wind.");
	}
}
