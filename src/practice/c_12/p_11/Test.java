package practice.c_12.p_11;

import practice.c_12.p_10.Exception1;
import practice.c_12.p_10.Exception2;

public class Test {
	public static void g() throws Exception1{
		throw new Exception1();
	}
	
	public static void f() throws Exception2{
		try{
			g();
		}catch(Exception1 e){
			e.printStackTrace();
			Exception2 e2=new Exception2();
			e2.initCause(new RuntimeException());
			throw e2;
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
