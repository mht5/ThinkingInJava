package practice.c_07.p_09;

public class Stem extends Root{
	Component1 c1=new Component1();
	Component2 c2=new Component2();
	Component3 c3=new Component3();
	
	public Stem(){
		System.out.println("Stem constructor.");
	}
	
	public static void main(String[] args){
		new Stem();
	}
}
