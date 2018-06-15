package practice.c_05.p_14;

public class Tree {
	static double height=10.24;
	static int year;
	static{
		year=24;
	}
	
	Tree(){
		System.out.println("Initializing...");
	}
	
	static{
		System.out.println("This tree is "+year+" years old and "+height+" meters tall.");
	}
}
