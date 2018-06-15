package test.c_16.array_options;

public class Apple{
	private static long counter;
	private final long id=counter++;
	
	public String toString(){
		return "Apple"+id;
	}
}
