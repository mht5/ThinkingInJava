package test.c_03.literals;

/**
 * 直接常量
 * @author mohan
 *
 */
public class Literals {
	public static void main(String[] args){
		int i1=0x2f;  //十六进制
		System.out.println("i1: "+Integer.toBinaryString(i1));
		int i2=0X2F  ;//十六进制
		System.out.println("i2: "+Integer.toBinaryString(i2));
		int i3=0177;  //八进制
		System.out.println("i3: "+Integer.toBinaryString(i3));
		char c=0xffff;  //char类型最大十六进制数值
		System.out.println("c: "+Integer.toBinaryString(c));
		byte b=0x7f;  //byte类型最大十六进制值
		System.out.println("b: "+Integer.toBinaryString(b));
		short s=0x7fff;  //short类型最大十六进制值
		System.out.println("s: "+Integer.toBinaryString(s));
		long n1=200L;
		long n2=200l;
		long n3=200;
		float f1=1F;
		float f2=1f;
		float f3=1;
		double d1=1D;
		double d2=1d;
		double d3=1;
	}
}
