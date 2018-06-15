package test.c_09.filter_processor;

import test.c_09.interface_processor.Processor;
import test.c_09.wave_form.Filter;
import test.c_09.wave_form.WaveForm;

/**
 *   ≈‰∆˜
 * @author mohan
 *
 */
public class FilterAdapter implements Processor{
	private Filter filter;
	
	public FilterAdapter(Filter filter){
		this.filter=filter;
	}
	
	public String name(){
		return filter.name();
	}
	
	public WaveForm process(Object input){
		return filter.process((WaveForm)input);
	}
}
