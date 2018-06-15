package test.c_08.private_override;

/**
 * private方法默认是final的，而且对导出类是屏蔽的。
 * Derived类中的f()是一个全新的方法，基类的f()在Derived中是不可见的，所以不能重载
 * @author mohan
 *
 */
public class PrivateOverride {
	private void f(){
		System.out.println("private f()");
	}
	
	public static void main(String[] args){
		PrivateOverride po=new Derived();
		po.f();
	}
}
