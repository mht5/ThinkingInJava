package test.c_09.wave_form;

public class Filter {
	public String name(){
		return getClass().getSimpleName();
	}
	
	public WaveForm process(WaveForm input){
		return input;
	}
}
