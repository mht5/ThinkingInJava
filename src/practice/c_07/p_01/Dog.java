package practice.c_07.p_01;

public class Dog {
	private String bark;
	
	public Dog(){
		bark="Wurf!";
		System.out.println("constructing.");
	}
	
	public void doBark(){
		System.out.println(bark);
	}
}
