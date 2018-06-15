package test.c_05.overloading;

public class Overloading {
	public static void main(String[] args){
		for(int i=1;i<6;i++){
			Tree tree=new Tree(i);
			tree.printInfo();
			tree.printInfo("Overloading method: ");
		}
		new Tree();
	}
}
