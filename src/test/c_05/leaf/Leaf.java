package test.c_05.leaf;

public class Leaf {
	int i=0;
	public static void main(String[] args){
		Leaf l=new Leaf();
		l.increament().increament().increament().print();
	}
	
	Leaf increament(){
		i++;
		return this;
	}
	
	void print(){
		System.out.println("i="+i);
	}
}
