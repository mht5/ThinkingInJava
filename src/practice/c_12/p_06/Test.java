package practice.c_12.p_06;

public class Test {
	public static void f() throws LogException1{
		throw new LogException1();
	}
	
	public static void g() throws LogException2{
		throw new LogException2();
	}
	
	public static void main(String[] args){
		try{
			f();
		}catch(LogException1 e){
			System.err.println("Caught "+e);
//			e.printStackTrace();
		}
		try{
			g();
		}catch(LogException2 e){
			System.err.println("Caught "+e);
//			e.printStackTrace();
		}
	}
}
