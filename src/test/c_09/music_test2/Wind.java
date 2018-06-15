package test.c_09.music_test2;

public class Wind implements Instrument{
	public void play(Note n){
		adjust();
		System.out.println("Wind.play("+n+")");
	}
	
	public String toString(){
		return "Wind";
	}
	
	public void adjust(){
		System.out.println("Adjusting wind.");
	}
}
