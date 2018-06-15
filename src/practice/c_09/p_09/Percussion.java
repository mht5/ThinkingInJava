package practice.c_09.p_09;

public class Percussion extends Instrument{
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
