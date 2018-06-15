package test.c_08.music_test2;

public class Music {
	public static void tune(Wind w){
		w.play(Note.MIDDLE_C);
	}
	
	public static void tune(Stringed s){
		s.play(Note.C_SHARP);
	}
	
	public static void tune(Brass b){
		b.play(Note.B_FLAT);
	}
	
	public static void main(String[] args){
		tune(new Wind());
		tune(new Stringed());
		tune(new Brass());
	}
}
