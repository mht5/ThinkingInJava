package test.c_10.factories;

/**
 * 使用匿名内部类实现工厂方法
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
