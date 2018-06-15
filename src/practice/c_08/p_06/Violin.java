package practice.c_08.p_06;

public class Violin extends Stringed{
	public void play(Note n){
		System.out.println(what());
		adjust();
		System.out.println("Violin.play("+n+")");
	}
	
	public String what(){
		return this.toString();
	}
	
	public void adjust(){
		System.out.println("Adjusting violin.");
	}
}
