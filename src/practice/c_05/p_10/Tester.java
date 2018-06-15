package practice.c_05.p_10;

public class Tester {
	public static void main(String[] args){
		Tree t=new Tree();
		t.plant();
		new Tree(false);
		System.gc();
	}
}
