package test.c_12.never_caught;

/**
 * 如果RuntimeException未被捕获而直达main()，程序在退出前会调用异常的printStackTrace()
 * 只有RuntimeException可以在代码中忽略(因为它代表编程错误)，其它的异常的处理都是编译器强制实施的
 * @author mohan
 *
 */
public class NeverCaught {
	public static void f(){
		throw new RuntimeException("from f()");
	}
	
	public static void g(){
		f();
	}
	
	public static void main(String[] args){
		g();
	}
}
