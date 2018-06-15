package test.c_05.explicit_static;

public class Cups {
	static Cup cup1;
	static Cup cup2;
	static{
		cup1=new Cup(1);
		cup2=new Cup(2);
	}
	
	Cups(int marker){
		System.out.println("cups("+marker+")");
	}
}
