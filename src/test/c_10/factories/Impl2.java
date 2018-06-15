package test.c_10.factories;

public class Impl2 implements Service{
	protected Impl2(){}
	
	public void method1(){
		System.out.println("Impl2.method1");
	}
	
	public void method2(){
		System.out.println("Impl2.method2");
	}
	
	public static ServiceFactory factory=new ServiceFactory(){
		public Service getService(){
			return (new Impl2());
		}
	};
}
