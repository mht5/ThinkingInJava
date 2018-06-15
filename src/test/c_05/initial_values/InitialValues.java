package test.c_05.initial_values;

public class InitialValues {
	boolean bool=true;
	char c='x';
	byte b;
	short s;
	int i;
	long l=1024;
	float f;
	double d=10.24;
	InitialValues reference;
	
	void printValue(){
		System.out.println("Data Type    Initial Value");
		System.out.println("boolean    "+bool);
		System.out.println("char    "+c);
		System.out.println("byte    "+b);
		System.out.println("short    "+s);
		System.out.println("int    "+i);
		System.out.println("long    "+l);
		System.out.println("float    "+f);
		System.out.println("double    "+d);
		System.out.println("InitialValues    "+reference);
	}
	
	public static void main(String[] args){
		InitialValues iv=new InitialValues();
		iv.printValue();
		new InitialValues().printValue();
	}
}
