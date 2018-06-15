package test.c_12.rethrow_new;

/**
 * 抛出新的异常
 * @author mohan
 *
 */
public class RethrowNew {
	public static void f() throws Exception1{
		throw new Exception1("thrown from f()");
	}
	
	public static void main(String[] args){
		try{
			try{
				f();
			}catch(Exception1 e){
				System.err.println("Caught in inner try");
				e.printStackTrace();
				throw new Exception2("thrown in inner try");
			}
		}catch(Exception2 e){
			System.err.println("Caught in outer try");
			e.printStackTrace();
		}
	}
}
