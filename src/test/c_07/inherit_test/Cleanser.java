package test.c_07.inherit_test;

public class Cleanser {
	private String s="Cleanser";
	
	public void append(String str){
		s+=str;
	}
	
	public void dilute(){
		append(" dilite()");
	}
	
	public void apply(){
		append(" apply()");
	}
	
	public void scrub(){
		append(" scrub()");
	}
	
	public String toString(){
		return s;
	}
	
	public static void main(String[] args){
		Cleanser c=new Cleanser();
		c.dilute();
		c.apply();
		c.scrub();
		System.out.println(c);
	}
}
