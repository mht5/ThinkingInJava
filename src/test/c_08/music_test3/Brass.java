package test.c_08.music_test3;

public class Brass extends Wind{
	public void play(Note n){
		adjust();
		System.out.println("Brass.play("+n+")");
	}
	
	public void adjust(){
		System.out.println("Adjusting brass.");
	}
}
