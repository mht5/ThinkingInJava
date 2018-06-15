package practice.c_05.p_12;

public class Tester {
	public static void main(String[] args){
		new Tank(true).emptyTank();
		new Tank().fullTank();
		System.gc();
	}
}
