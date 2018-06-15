package practice.c_21.p_01;

public class Printer implements Runnable{
	private static int taskCount;
	private final int id=taskCount++;
	
	public Printer(){
		System.out.println("Printer started, ID: "+id);
	}
	
	public void run(){
		System.out.println("1st stage, ID: "+id);
		Thread.yield();
		System.out.println("2nd stage, ID: "+id);
		Thread.yield();
		System.out.println("3rd stage, ID: "+id);
		Thread.yield();
		System.out.println("Printer ended, ID: "+id);
	}
}
