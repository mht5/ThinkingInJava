package test.c_05.primitive_overloading;

/**
 * 如果传入的数据类型小于方法中声明的参数类型，实际数据类型会被提升
 * char类型不同，如果没有接受char类型参数的方法，会直接从int类型开始提升
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
