package test.c_05.none_static_initialization;

public class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1=new Mug(1);
		mug2=new Mug(2);
		System.out.println("mug1 and mu2 initialized.");
	}
	
	Mugs(){
		System.out.println("mugs()");
	}
	
	Mugs(int marker){
		System.out.println("mugs("+marker+")");
	}
}
