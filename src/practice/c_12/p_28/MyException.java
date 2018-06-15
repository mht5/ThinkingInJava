package practice.c_12.p_28;

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
