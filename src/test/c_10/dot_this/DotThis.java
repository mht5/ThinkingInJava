package test.c_10.dot_this;

public class DotThis {
	public void f(){
		System.out.println("DotThis.f()");
	}
	
	class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
		
		public void f(){
			System.out.println("Inner.f()");
		}
	}
	
	public Inner inner(){
		return (new Inner());
	}
	
	public static void main(String[] args){
		DotThis dt=new DotThis();
		Inner i=dt.inner();
		i.outer().f();
	}
}
