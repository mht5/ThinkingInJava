package test.c_09.music_test2;

public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e){
		for(Instrument i : e){
			tune(i);
		}
	}
	
	public static void main(String[] args){
		Instrument[] e={
			new Woodwind(),
			new Brass(),
			new Wind(),
			new Stringed(),
			new Percussion()
		};
		tuneAll(e);
	}
}
