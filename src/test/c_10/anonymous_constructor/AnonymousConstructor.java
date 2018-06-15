package test.c_10.anonymous_constructor;

/**
 * 匿名内部类通过实例初始化模仿构造器
 * @author mohan
 *
 */
public class AnonymousConstructor {
	public static Base getBase(int i){
		return new Base(i){
			{
				System.out.println("Inside instance initializer");
			}
			public void f(){
				System.out.println("In anonymous f()");
			}
		};
	}
	
	public static void main(String[] args){
		getBase(47).f();
	}
}
