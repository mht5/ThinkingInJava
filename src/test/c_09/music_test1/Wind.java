package test.c_09.music_test1;

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
