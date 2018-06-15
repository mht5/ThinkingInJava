package test.c_05.flower;

public class Flower {
	int petalCount=0;
	String s="none";
	
	Flower(int petals){
		System.out.println("only int arg.");
		petalCount=petals;
	}
	
	Flower(String s){
		System.out.println("only String arg.");
		this.s=s;
	}
	
	Flower(String s, int petal){
//		必须在起始处，否则会报错
		this(s);
		petalCount=petal;
		System.out.println("String and int args.");
	}
	
	Flower(){
		this("bloom",6);
		System.out.println("no arg.");
	}
	
	void printInfo(){
		System.out.println(s+"\t"+petalCount);
	}
	
	public static void main(String[] args){
		Flower f=new Flower();
		f.printInfo();
	}
}
