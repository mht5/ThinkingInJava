package practice.c_08.p_06;

import java.util.Random;

public class RandomInstrumentGenerator {
	private static Random rand=new Random();
	
	public Instrument next(){
		switch(rand.nextInt(6)){
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Brass();
			case 4: return new Woodwind();
			case 5: return new Violin();
			default: return new Instrument();
		}
	}
}
