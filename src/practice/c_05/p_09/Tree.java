package practice.c_05.p_09;

public class Tree {
	double height;
	int year;
	
	Tree(double height){
		System.out.println("This tree is "+height+" meters high.");
		this.height=height;
	}
	
	Tree(int year){
		System.out.println("This tree is "+year+" years old.");
		this.year=year;
	}
	
	Tree(int year, double height){
//		只能包含一个构造器
		this(year);
		this.height=height;
		System.out.println("Planting a tree.");
	}
	
	void printInfo(){
		System.out.println("This tree is "+year+" years old and "+height+" meters high.");
	}
	
	public static void main(String[] args){
		Tree t=new Tree(6,4.2);
		t.printInfo();
		t=new Tree(4.2);
		t.printInfo();
	}
}
