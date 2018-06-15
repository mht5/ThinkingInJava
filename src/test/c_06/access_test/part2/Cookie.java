package test.c_06.access_test.part2;

public class Cookie {
	private Cookie(){
		System.out.println("Cookie construcor.");
	}
	static Cookie makeACookie(){
		System.out.println("making a cookie.");
		return new Cookie();
	}
	
	static void bite(){
		System.out.println("bite this.");
	}
}
