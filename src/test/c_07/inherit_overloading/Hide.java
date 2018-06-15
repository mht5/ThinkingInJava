package test.c_07.inherit_overloading;

public class Hide {
	public static void main(String[] args){
		Bart b=new Bart();
		b.doh(1);
		b.doh(1f);
		b.doh('x');
		b.doh(new MilHouse());
	}
}
