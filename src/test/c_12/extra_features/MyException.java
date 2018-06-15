package test.c_12.extra_features;

public class MyException extends Exception{
	private int x;
	
	public MyException(){}
	
	public MyException(String msg){
		super(msg);
	}
	
	public MyException(String msg, int x){
		super(msg);
		this.x=x;
	}
	
	public int val(){
		return x;
	}
	
	public String getMessage(){
		return (super.getMessage()+" "+x);
	}
}
