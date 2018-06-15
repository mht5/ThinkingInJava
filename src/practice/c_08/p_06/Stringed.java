package practice.c_08.p_06;

public class Stringed extends Instrument{
	public void play(Note n){
		System.out.println(what());
		adjust();
		System.out.println("Stringed.play("+n+")");
	}
	
	public String what(){
		return this.toString();
	}
	
	public void adjust(){
		System.out.println("Adjusting stringed.");
	}
}
