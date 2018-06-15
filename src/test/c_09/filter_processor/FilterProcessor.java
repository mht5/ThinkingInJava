package test.c_09.filter_processor;

import test.c_09.interface_processor.Apply;
import test.c_09.wave_form.BandPass;
import test.c_09.wave_form.HighPass;
import test.c_09.wave_form.LowPass;
import test.c_09.wave_form.WaveForm;

public class FilterProcessor {
	public static void main(String[] args){
		WaveForm w=new WaveForm();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0,4.0)), w);
	}
}
