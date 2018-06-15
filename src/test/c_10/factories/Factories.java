package test.c_10.factories;

/**
 * ʹ�������ڲ���ʵ�ֹ�������
 * @author mohan
 *
 */
public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service s=fact.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args){
		serviceConsumer(Impl1.factory);
		serviceConsumer(Impl2.factory);
	}
}
