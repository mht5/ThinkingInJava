package test.c_02.statics;

/**
 * static1.x��static2.xָ��ͬһ�ռ䣨x�Ǿ�̬������
 * @author mohan
 *
 */
public class Test {
	public static void main(String[] args){
		System.out.println("static variable test...");
		StaticTest static1=new StaticTest();
		StaticTest static2=new StaticTest();
		int m=static1.x;
		int n=static2.x;
		System.out.println("static1.x="+m);
		System.out.println("static2.x="+n+"\n");
		
		StaticTest.x++;
		m=static1.x;
		n=static2.x;
		System.out.println("static1.x="+m);
		System.out.println("static2.x="+n+"\n");
		
		System.out.println("static method test...");
		Incrementable.increment();
		m=static1.x;
		n=static2.x;
		System.out.println("static1.x="+m);
		System.out.println("static2.x="+n+"\n");
	}
}
