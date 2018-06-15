package test.c_05.order_of_initialization;

public class House {
	Window w1=new Window(1);
	
	House(){
		System.out.println("house()");
		w3=new Window(33);
	}
	
	Window w2=new Window(2);
	
	void test(){
		System.out.println("test()");
	}
	
	Window w3=new Window(3);
}
