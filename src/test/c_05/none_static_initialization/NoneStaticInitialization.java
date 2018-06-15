package test.c_05.none_static_initialization;

public class NoneStaticInitialization {
	public static void main(String[] args){
		System.out.println("inside main()");
		new Mugs();
		System.out.println("new mugs() completed");
		new Mugs(1);
		System.out.println("new mugs(1) completed");
	}
}
