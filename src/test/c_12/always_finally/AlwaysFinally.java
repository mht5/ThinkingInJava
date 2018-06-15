package test.c_12.always_finally;

class MyException extends Exception{}

public class AlwaysFinally {
	public static void main(String[] args){
		System.out.println("Entering first try block...");
		try{
			System.out.println("Entering second try block...");
			try{
				throw new MyException();
			}finally{
				System.out.println("finally in second try block");
			}
		}catch(MyException e){
			System.out.println("Caught MyException");
		}finally{
			System.out.println("finally in first try block");
		}
	}
}
