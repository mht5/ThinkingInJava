package test.c_08.static_polymorphism;

/**
 * ��̬���������ж�̬��
 * ��̬���������࣬�������뵥�����������
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
