package practice.c_09.p_05;

import test.c_09.music_test2.Instrument;
import test.c_09.music_test2.Note;

public class InstrumentImpl implements Instrument{

	@Override
	public void play(Note n) {
		adjust();
		System.out.println("InstrumentImpl.play("+n+")");
	}

	@Override
	public void adjust() {
		System.out.println("InstrumentImpl.adjust()");
	}
	
	public static void main(String[] args){
		Instrument i=new InstrumentImpl();
		i.play(Note.MIDDLE_C);
	}
}
