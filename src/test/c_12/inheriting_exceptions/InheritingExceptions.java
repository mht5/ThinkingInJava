package test.c_12.inheriting_exceptions;

public class InheritingExceptions {
	public static void f() throws SimpleException{
		System.out.println("A simpleException throwed from f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args){
		try{
			f();
		}catch(Exception e){
			System.err.println("Caught it!");
			e.printStackTrace();
		}
	}
}
