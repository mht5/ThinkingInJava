package test.c_12.full_constructors;

public class FullConstructor {
	public static void f() throws MyException{
		System.out.println("a MyException throwed from f()");
		throw new MyException();
	}
	
	public static void g() throws MyException{
		System.out.println("a MyException throwed from g()");
		throw new MyException("a new exception");
	}
	
	public static void main(String[] args){
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}
	}
}
