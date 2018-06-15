package practice.c_08.p_06;

public class Brass extends Wind{
	public void play(Note n){
		System.out.println(what());
		adjust();
		System.out.println("Brass.play("+n+")");
	}
	
	public void adjust(){
		System.out.println("Adjusting brass.");
	}
}
