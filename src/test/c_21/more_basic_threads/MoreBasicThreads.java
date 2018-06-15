package test.c_21.more_basic_threads;

import test.c_21.lift_off.LiftOff;

/**
 * 使用多个线程驱动更多任务
 * @author mohan
 *
 */
public class MoreBasicThreads {
	public static void main(String[] args){
		for(int i=0; i<5; i++){
			new Thread(new LiftOff()).start();
		}
		System.out.println("Waitting for lift off...");
	}
}
