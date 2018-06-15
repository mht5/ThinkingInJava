package test.c_08.music_test3;

public class Woodwind extends Wind{
	public void play(Note n){
		adjust();
		System.out.println("Woodwind.play("+n+")");
	}
	
	public String what(){
		return "Woodwind";
	}
}
