package practice.c_09.p_09;

public class Wind extends Instrument{
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
