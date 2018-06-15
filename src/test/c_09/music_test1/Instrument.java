package test.c_09.music_test1;

abstract class Instrument {
	abstract void play(Note n);
	
	public String what(){
		return "Instrument";
	}
	
	abstract void adjust();
}
