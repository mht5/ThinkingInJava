package practice.c_09.p_14;

public class Tester {
	public static void print1(IFirst x){
		x.print1();
	}
	
	public static void print2(ISecond x){
		x.print2();
	}
	
	public static void print3(IThird x){
		x.print3();
	}
	
	public static void print4(IFourth x){
		x.print4();
	}
	
	public static void main(String[] args){
		print1(new FourthImpl());
		print2(new FourthImpl());
		print3(new FourthImpl());
		print4(new FourthImpl());
	}
}
