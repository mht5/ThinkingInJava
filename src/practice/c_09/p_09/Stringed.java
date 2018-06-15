package practice.c_09.p_09;

public class Stringed extends Instrument{
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
