package test.c_12.switch_test;

class Exception1 extends Exception{}
class Exception2 extends Exception{}

public class OnOffSwitch {
	private static Switch sw=new Switch();
	
	public static void f() throws Exception1,Exception2{}
	
	public static void main(String[] args){
		try{
			sw.on();
			f();
			sw.off();
		}catch(Exception1 e){
			System.out.println("Caught Exception1");
		}catch(Exception2 e){
			System.out.println("Caught Exception2");
		}finally{
			sw.off();
			System.out.println("It's over now.");
		}
	}
}
