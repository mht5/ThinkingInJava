package test.c_09.interface_processor;

public class UpperCase extends StringProcessor{
	public String process(Object input){
		return input.toString().toUpperCase();
	}
}
