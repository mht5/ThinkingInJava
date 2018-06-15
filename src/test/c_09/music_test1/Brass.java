package test.c_09.music_test1;

public class Brass extends Wind{
	public void play(Note n){
		adjust();
		System.out.println("Brass.play("+n+")");
	}
	
	public void adjust(){
		System.out.println("Adjusting brass.");
	}
}
