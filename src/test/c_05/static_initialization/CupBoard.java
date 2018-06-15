package test.c_05.static_initialization;

public class CupBoard {
	Bowl bowl3=new Bowl(3);
	static Bowl bowl4=new Bowl(4);
	
	CupBoard(){
		System.out.println("cupBoard()");
		bowl5.f1(2);
	}
	
	void f3(int marker){
		System.out.println("f3("+marker+")");
	}
	
	static Bowl bowl5=new Bowl(5);
}
