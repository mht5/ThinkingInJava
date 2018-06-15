package practice.c_07.p_11;

public class Detergent{
	Cleanser c=new Cleanser();
	
	public void dilute(){
		c.dilute();
	}
	
	public void apply(){
		c.apply();
	}
	
	public void scrub(){
		c.scrub();
	}
	
	public void foam(){
		c.foam();
	}
	
	public String toString(){
		return (c.toString());
	}
	
	public static void main(String[] args){
		Detergent d=new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		System.out.println(d);
		System.out.println("Testing base class: ");
		Cleanser.main(args);
	}
}
