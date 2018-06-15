package practice.c_12.p_04;

public class Test {
	public static void f() throws MyException{
		throw new MyException("This is a new exception");
	}
	
	public static void main(String[] args){
		try{
			f();
		}catch(MyException e){
			e.printMsg();
			e.printStackTrace();
		}
	}
}
