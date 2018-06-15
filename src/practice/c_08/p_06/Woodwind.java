package practice.c_08.p_06;

public class Woodwind extends Wind{
	public void play(Note n){
		System.out.println(what());
		adjust();
		System.out.println("Woodwind.play("+n+")");
	}
	
	public String what(){
		return this.toString();
	}
}
