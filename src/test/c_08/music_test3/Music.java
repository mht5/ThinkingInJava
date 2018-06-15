package test.c_08.music_test3;

public class Music {
	private static RandomInstrumentGenerator gen=new RandomInstrumentGenerator();
	
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e){
		for(Instrument i : e){
			tune(i);
		}
	}
	
	public static void main(String[] args){
		Instrument[] e=new Instrument[13];
		for(int i=0;i<e.length;i++){
			e[i]=gen.next();
		}
		tuneAll(e);
	}
}
