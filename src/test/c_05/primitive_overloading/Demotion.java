package test.c_05.primitive_overloading;

public class Demotion {
	public void f1(char x){
		System.out.print("f1(char) ");
	}
	public void f1(byte x){
		System.out.print("f1(byte) ");
	}
	public void f1(short x){
		System.out.print("f1(short) ");
	}
	public void f1(int x){
		System.out.print("f1(int) ");
	}
	public void f1(long x){
		System.out.print("f1(long) ");
	}
	public void f1(float x){
		System.out.print("f1(float) ");
	}
	public void f1(double x){
		System.out.print("f1(double) ");
	}

	public void f2(char x){
		System.out.print("f2(char) ");
	}
	public void f2(byte x){
		System.out.print("f2(byte) ");
	}
	public void f2(short x){
		System.out.print("f2(short) ");
	}
	public void f2(int x){
		System.out.print("f2(int) ");
	}
	public void f2(long x){
		System.out.print("f2(long) ");
	}
	public void f2(float x){
		System.out.print("f2(float) ");
	}

	public void f3(char x){
		System.out.print("f3(char) ");
	}
	public void f3(byte x){
		System.out.print("f3(byte) ");
	}
	public void f3(short x){
		System.out.print("f3(short) ");
	}
	public void f3(int x){
		System.out.print("f3(int) ");
	}
	public void f3(long x){
		System.out.print("f3(long) ");
	}

	public void f4(char x){
		System.out.print("f4(char) ");
	}
	public void f4(byte x){
		System.out.print("f4(byte) ");
	}
	public void f4(short x){
		System.out.print("f4(short) ");
	}
	public void f4(int x){
		System.out.print("f4(int) ");
	}

	public void f5(char x){
		System.out.print("f5(char) ");
	}
	public void f5(byte x){
		System.out.print("f5(byte) ");
	}
	public void f5(short x){
		System.out.print("f5(short) ");
	}
	
	public void f6(char x){
		System.out.print("f6(char) ");
	}
	public void f6(byte x){
		System.out.print("f6(byte) ");
	}
	
	public void f7(char x){
		System.out.println("f7(char) ");
	}
	
	public void testConst(){
		System.out.print("5: ");
		f1(5);
		f2(5);
		f3(5);
		f4(5);
		f5((short)5);
		f6((byte)5);
		f7((char)5);
	}
	
	public void testChar(){
		char x='x';
		System.out.println("char: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7(x);
	}
	
	public void testByte(){
		byte x=0;
		System.out.println("byte: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6(x);
		f7((char)x);
	}
	
	public void testShort(){
		short x=0;
		System.out.println("short: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5(x);
		f6((byte)x);
		f7((char)x);
	}
	
	public void testInt(){
		int x=0;
		System.out.println("int: ");
		f1(x);
		f2(x);
		f3(x);
		f4(x);
		f5((short)x);
		f6((byte)x);
		f7((char)x);
	}
	
	public void testLong(){
		long x=0;
		System.out.println("long: ");
		f1(x);
		f2(x);
		f3(x);
		f4((int)x);
		f5((short)x);
		f6((byte)x);
		f7((char)x);
	}
	
	public void testFloat(){
		float x=0;
		System.out.println("float: ");
		f1(x);
		f2(x);
		f3((long)x);
		f4((int)x);
		f5((short)x);
		f6((byte)x);
		f7((char)x);
	}
	
	public void testDouble(){
		double x=0;
		System.out.println("double: ");
		f1(x);
		f2((float)x);
		f3((long)x);
		f4((int)x);
		f5((short)x);
		f6((byte)x);
		f7((char)x);
	}
}
