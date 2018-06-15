package test.c_07.inherit_init_order;

public class Insect {
	private int i=9;
	protected int j;
	
	public Insect(){
		System.out.println("i="+i+", j="+j);
		j=47;
	}
	
	private static int x1=printInit("static Insect.x1 initialized");
	
	static int printInit(String s){
		System.out.println(s);
		return 23;
	}
}
