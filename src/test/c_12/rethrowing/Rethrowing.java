package test.c_12.rethrowing;

/**
 * �����׳��쳣
 * ���ֻ�ǰѵ�ǰ�쳣�����׳���printStackTrace()��ӡ����ԭ���쳣�׳���ĵ���ջ��Ϣ
 * ���ʹ��fillInStackTrace()������һ��Throwable��������ͨ���ѵ�ǰ����ջ��Ϣ�����쳣��������
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
