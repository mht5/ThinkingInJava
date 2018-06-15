package test.c_21.cached_thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import test.c_21.lift_off.LiftOff;

/**
 * ʹ��CacheredThreadPool
 * ʹ��shutdown()���Է�ֹ�������ύ�����Executor�����Executor���ڳ���������ɺ󾡿��˳�
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
