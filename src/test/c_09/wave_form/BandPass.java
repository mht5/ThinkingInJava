package test.c_09.wave_form;

public class BandPass extends Filter{
	double lowCut,highCut;
	
	public BandPass(double lowCut, double highCut){
		this.lowCut=lowCut;
		this.highCut=highCut;
	}
	
	public WaveForm process(WaveForm input){
		return input;
	}
}
