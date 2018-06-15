package practice.c_21.p_01;

public class Test {
	public static void main(String[] args){
		for(int i=0; i<7; i++){
			new Thread(new Printer()).start();
		}
		System.out.println("Waitting for printer to start...");
	}
}
