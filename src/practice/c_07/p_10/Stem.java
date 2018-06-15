package practice.c_07.p_10;

public class Stem extends Root{
	Component1 c1=new Component1("from stem");
	Component2 c2=new Component2("from stem");
	Component3 c3=new Component3("from stem");
	
	public Stem(int i){
		super(i);
		System.out.println("Stem constructor.");
	}
	
	public static void main(String[] args){
		new Stem(1);
	}
}
