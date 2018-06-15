package test.c_09.wave_form;

public class HighPass extends Filter{
	double cutOff;
	
	public HighPass(double cutOff){
		this.cutOff=cutOff;
	}
	
	public WaveForm process(WaveForm input){
		return input;
	}
}
