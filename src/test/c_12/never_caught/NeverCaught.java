package test.c_12.never_caught;

/**
 * ���RuntimeExceptionδ�������ֱ��main()���������˳�ǰ������쳣��printStackTrace()
 * ֻ��RuntimeException�����ڴ����к���(��Ϊ�������̴���)���������쳣�Ĵ����Ǳ�����ǿ��ʵʩ��
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
