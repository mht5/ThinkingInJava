package test.c_10.callbacks;

public class Callee1 implements Increamentable{
	private int i=0;
	
	public void increament(){
		System.out.println(++i);
	}
}
