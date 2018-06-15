package practice.c_07.p_13;

public class BigMouth extends Human{
	public void eat(String s, int i, double d){
		System.out.println("Mr.bigMouth has just eat "+i+" "+s+" which is worth "+d+"yuan.");
	}
	
	public static void main(String[] args){
		BigMouth b=new BigMouth();
		b.eat(10.24);
		b.eat("pancake");
		b.eat("pancake",2);
		b.eat("pancake", 2, 20.2);
	}
}
