package test.c_12.exception_methods;

public class ExceptionMethods {
	public static void main(String[] args){
		try{
			throw new Exception("new exception");
		}catch(Exception e){
			System.out.println("Caught exception");
			System.out.println("getMessage(): "+e.getMessage());
			System.out.println("getLocalizedMessage(): "+e.getLocalizedMessage());
			System.out.println("toString(): "+e);
			System.out.println("printStackTrace(): ");
			e.printStackTrace(System.out);
		}
	}
}
