package test.c_05.primitive_overloading;

/**
 * ����������������С�ڷ����������Ĳ������ͣ�ʵ���������ͻᱻ����
 * char���Ͳ�ͬ�����û�н���char���Ͳ����ķ�������ֱ�Ӵ�int���Ϳ�ʼ����
 * @author mohan
 *
 */

public class Tester {
	public static void main(String[] args){
		PrimitiveOverloading p=new PrimitiveOverloading();
		p.testConst();
		p.testChar();
		p.testByte();
		p.testShort();
		p.testInt();
		p.testLong();
		p.testFloat();
		p.testDouble();
		
		System.out.println("\n********************\n");
		
		Demotion d=new Demotion();
		d.testConst();
		d.testChar();
		d.testByte();
		d.testShort();
		d.testInt();
		d.testLong();
		d.testFloat();
		d.testDouble();
	}
}
