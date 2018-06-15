package test.c_05.overloading;

public class Tree {
	double height;
	
	Tree(){
		this.height=0;
		System.out.println("Planting a seedling.");
	}
	
	Tree(double height){
		this.height=height;
		System.out.println("Plating a tree which is "+height+" meters tall.");
	}
	
	public void printInfo(){
		System.out.println("The tree is "+height+" meters tall.");
	}
	
	public void printInfo(String s){
		System.out.println(s+": The tree is "+height+" meters tall.");
	}
}
