package test.c_21.main_thread;

import test.c_21.lift_off.LiftOff;

/**
 * 在main中调用ListOff.run()
 * @author mohan
 *
 */
public class MainThread {
	public static void main(String[] args){
		LiftOff launch=new LiftOff();
		launch.run();
	}
}
