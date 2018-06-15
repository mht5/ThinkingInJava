package test.c_09.apply;

public class UpperCase extends Processor{
	public String process(Object input){
		return input.toString().toUpperCase();
	}
}
