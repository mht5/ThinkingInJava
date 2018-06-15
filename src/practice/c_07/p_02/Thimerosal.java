package practice.c_07.p_02;

public class Thimerosal extends Detergent{
	public void scrub(){
		append(" Thimerosal scrub()");
	}
	
	public void sterilize(){
		append(" sterilize()");
	}
	
	public static void main(String[] args){
		Thimerosal t=new Thimerosal();
		t.dilute();
		t.apply();
		t.scrub();
		t.foam();
		t.sterilize();
		System.out.println(t);
		System.out.println("Testing base class: ");
		Detergent.main(args);
	}
}
