package test.c_12.rethrowing;

/**
 * 重新抛出异常
 * 如果只是把当前异常重新抛出，printStackTrace()打印的是原来异常抛出点的调用栈信息
 * 如果使用fillInStackTrace()，返回一个Throwable对象，它是通过把当前调用栈信息填入异常对象建立的
 * @author mohan
 *
 */
public class Rethrowing {
	public static void f() throws Exception{
		System.out.println("Originating exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception{
		try{
			f();
		}catch(Exception e){
			System.out.println("Inside h(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args){
		try{
			g();
		}catch(Exception e){
			System.out.println("main.g: printStackTrace");
			e.printStackTrace(System.out);
		}
		try{
			h();
		}catch(Exception e){
			System.out.println("main.h: printStackTrace");
			e.printStackTrace(System.out);
		}
	}
}
