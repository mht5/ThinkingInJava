package test.c_08.static_polymorphism;

/**
 * 静态方法不具有多态性
 * 静态方法是与类，而不是与单个对象关联的
 * @author mohan
 *
 */
public class StaticSub extends StaticSuper{
	public static String staticGet(){
		return "derived staticGet()";
	}
	
	public String dynamicGet(){
		return "derived dynamicGet()";
	}
	
	public static void main(String[] args){
		StaticSuper sup=new StaticSub();
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}
