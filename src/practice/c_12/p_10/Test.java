package practice.c_12.p_10;

public class Test {
	public static void g() throws Exception1{
		throw new Exception1();
	}
	
	public static void f() throws Exception2{
		try{
			g();
		}catch(Exception1 e){
			e.printStackTrace();
			throw new Exception2();
		}
	}
	
	public static void main(String[] args) throws Exception2{
		try{
			f();
		}catch(Exception2 e){
			e.printStackTrace();
		}
	}
}
