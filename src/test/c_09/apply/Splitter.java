package test.c_09.apply;

import java.util.Arrays;

public class Splitter extends Processor{
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
