package test.c_10.callbacks;

public class Callee2 extends MyIncreament{
	private int i=0;
	
	public void increament(){
		super.increament();
		System.out.println(++i);
	}
	
	private class Closure implements Increamentable{
		public void increament(){
			Callee2.this.increament();
		}
	}
	
	Increamentable getCallbackReference(){
		return (new Closure());
	}
}
