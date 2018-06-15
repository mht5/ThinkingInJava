package test.c_09.wave_form;

public class LowPass extends Filter{
	double cutOff;
	
	public LowPass(double cutOff){
		this.cutOff=cutOff;
	}
	
	public WaveForm process(WaveForm input){
		return input;
	}
}
