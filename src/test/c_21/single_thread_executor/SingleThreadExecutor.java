package test.c_21.single_thread_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import test.c_21.lift_off.LiftOff;

/**
 * 使用SingleThreadExecutor执行多个任务时会将其排序
 * @author mohan
 *
 */
public class SingleThreadExecutor {
	public static void main(String[] args){
		ExecutorService exec=Executors.newSingleThreadExecutor();
		for(int i=0; i<5; i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
