package test.c_10.callbacks;

public class Caller {
	private Increamentable callbackReference;
	
	Caller(Increamentable i){
		this.callbackReference=i;
	}
	
	void go(){
		callbackReference.increament();
	}
}
