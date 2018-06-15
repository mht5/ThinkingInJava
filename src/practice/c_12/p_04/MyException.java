package practice.c_12.p_04;

public class MyException extends Exception{
	private String msg;
	
	MyException(){}
	
	MyException(String msg){
//		super(msg);
		this.msg=msg;
	}
	
	public void printMsg(){
		System.out.println(msg);
	}
}
