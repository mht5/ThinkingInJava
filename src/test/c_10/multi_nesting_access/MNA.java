	package test.c_10.multi_nesting_access;

public class MNA {
	private void f(){
		System.out.println("f()");
	}
	
	class A{
		private void g(){
			System.out.println("g()");
		}
		public class B{
			public void h(){
				g();
				f();
			}
		}
	}
}
