package test.c_08.music_test3;

import java.util.Random;

public class RandomInstrumentGenerator {
	private static Random rand=new Random();
	
	public Instrument next(){
		switch(rand.nextInt(5)){
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Brass();
			case 4: return new Woodwind();
			default: return new Instrument();
		}
	}
}
