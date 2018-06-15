package test.c_10.multi_nesting_access;

public class MultiNestingAccess {
	public static void main(String[] args){
		MNA mna=new MNA();
		MNA.A mnaa=mna.new A();
		MNA.A.B mnaab=mnaa.new B();
		mnaab.h();
	}
}
