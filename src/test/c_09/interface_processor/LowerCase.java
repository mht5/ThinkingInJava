package test.c_09.interface_processor;

public class LowerCase extends StringProcessor{
	public String process(Object input){
		return input.toString().toLowerCase();
	}
}
