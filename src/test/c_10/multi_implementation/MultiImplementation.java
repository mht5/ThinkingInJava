package test.c_10.multi_implementation;

class D{}
abstract class E{}
class Z extends D{
	E mekeE(){
		return (new E(){});
	}
}

public class MultiImplementation {
	static void takesD(D d){}
	static void takesE(E e){}
	
	public static void main(String[] args){
		Z z=new Z();
		takesD(z);
		takesE(z.mekeE());
	}
}
