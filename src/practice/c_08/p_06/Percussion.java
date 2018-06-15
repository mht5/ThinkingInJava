package practice.c_08.p_06;

public class Percussion extends Instrument{
	public void play(Note n){
		System.out.println(what());
		adjust();
		System.out.println("Percussion.play("+n+")");
	}
	
	public String what(){
		return this.toString();
	}
	
	public void adjust(){
		System.out.println("Adjusting percussion.");
	}
}
