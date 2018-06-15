package practice.c_12.p_13;

public class Test {
	public static void f(int x) throws Exception1, Exception2, Exception3{
		if(x>0){
			throw new Exception1();
		}
		else if(x==0){
			throw new Exception2();
		}
		else{
			throw new Exception3();
		}
	}
	
	public static void f(){
		throw new NullPointerException();
	}
	
	public static void main(String[] args){
		try{
			f(13);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("I don't know what just happend.");
		}
		try{
			f();
		}catch(NullPointerException e){
			e.printStackTrace();
		}finally{
			System.out.println("There maybe a NullPointerException.");
		}
	}
}
