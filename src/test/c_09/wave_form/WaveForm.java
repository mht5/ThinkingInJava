package test.c_09.wave_form;

public class WaveForm {
	private static long counter;
	private final long id=counter++;
	
	public String toString(){
		return ("WaveForm: "+id);
	}
}
