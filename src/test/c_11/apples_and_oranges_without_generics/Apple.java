package test.c_11.apples_and_oranges_without_generics;

public class Apple {
	private static long counter;
	private final long id=counter++;
	
	public long id(){
		return id;
	}
}
