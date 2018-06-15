package practice.c_12.p_25;

class Exception1 extends Exception{
	Exception1(String s){
		super(s);
	}
}
class Exception2 extends Exception1{
	Exception2(String s){
		super(s);
	}
}

class A{
	public void f() throws Exception{
		throw new Exception("thrown from A.f()");
	}
}

class B extends A{
	public void f() throws Exception{
		throw new Exception("thrown from B.f()");
//		throw new Exception1("thrown from B.f()");
	}
}

class C extends B{
	public void f() throws Exception{
		throw new Exception("thrown form C.f()");
//		throw new Exception2("thrown from C.f()");
	}
}

public class HandleException {
	public static void main(String[] args){
		A a=new C();
		try{
			a.f();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
