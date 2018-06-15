package practice.c_12.p_01;

public class Test {
	public static void f() throws MyException{
		throw new MyException("a new exception");
	}
	
	public static void main(String[] args){
		try{
			f();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("over.");
		}
	}
}
