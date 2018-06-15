package test.c_21.basic_threads;

import test.c_21.lift_off.LiftOff;

/**
 * 用线程驱动LiftOff对象
 * @author mohan
 *
 */
public class BasicThreads {
	public static void main(String[] args){
		Thread t=new Thread(new LiftOff());
		t.start();
		System.out.println("Waitting for lift off...");
	}
}
