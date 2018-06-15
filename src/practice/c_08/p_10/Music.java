package practice.c_08.p_10;

public class Music {
	public static void tune(Instrument i){
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args){
		Wind flute=new Wind();
		tune(flute);
	}
}
