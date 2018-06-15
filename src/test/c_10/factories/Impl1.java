package test.c_10.factories;

public class Impl1 implements Service{
	protected Impl1(){}
	
	public void method1(){
		System.out.println("Impl1.method1");
	}
	
	public void method2(){
		System.out.println("Impl1.method2");
	}
	
	public static ServiceFactory factory=new ServiceFactory(){
		public Service getService(){
			return (new Impl1());
		}
	};
}
