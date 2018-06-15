package test.c_08.music_test1;

public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args){
		tune(new Wind());
	}
}
