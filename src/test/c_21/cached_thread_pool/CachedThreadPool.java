package test.c_21.cached_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import test.c_21.lift_off.LiftOff;

/**
 * 使用CacheredThreadPool
 * 使用shutdown()可以防止新任务被提交到这个Executor，这个Executor将在程序运行完成后尽快退出
 * @author mohan
 *
 */
public class CachedThreadPool {
	public static void main(String[] args){
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0; i<5; i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
}
