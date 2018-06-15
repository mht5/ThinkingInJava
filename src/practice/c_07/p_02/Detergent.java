package practice.c_07.p_02;

public class Detergent extends Cleanser{
	/**
	 * 重写该方法
	 */
	public void scrub(){
		append(" Detergent scrub()");
		//调用基类的scrub()
		super.scrub();
	}
	
	public void foam(){
		append(" foam()");
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
