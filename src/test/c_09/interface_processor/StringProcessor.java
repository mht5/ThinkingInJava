package test.c_09.interface_processor;

public abstract class StringProcessor implements Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	
	public abstract String process(Object input);
	
	public static String s="What are you going to do next?";
	
	public static void main(String[] args){
		Apply.process(new UpperCase(), s);
		Apply.process(new LowerCase(), s);
		Apply.process(new Splitter(), s);
	}
}
