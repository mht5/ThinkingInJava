package test.c_09.music_test1;

public class Woodwind extends Wind{
	public void play(Note n){
		adjust();
		System.out.println("Woodwind.play("+n+")");
	}
	
	public String what(){
		return "Woodwind";
	}
}
