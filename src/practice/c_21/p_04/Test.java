package practice.c_21.p_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import practice.c_21.p_02.Fibonacci;

public class Test {
	public static void main(String[] args){
		ExecutorService exec=Executors.newCachedThreadPool();
		System.out.println("Using cachedThreadPool:");
		for(int i=0; i<5; i++){
			exec.execute(new Fibonacci(i));
		}
		Thread.yield();
		exec.shutdown();
		System.out.println();
		
		exec=Executors.newFixedThreadPool(5);
		System.out.println("Using fixedThreadPool:");
		for(int i=0; i<5; i++){
			exec.execute(new Fibonacci(i));
		}
		Thread.yield();
		exec.shutdown();
		System.out.println();
		
		exec=Executors.newSingleThreadExecutor();
		System.out.println("Using singleThreadExecutor:");
		for(int i=0; i<5; i++){
			exec.execute(new Fibonacci(i));
		}
		Thread.yield();
		exec.shutdown();
		System.out.println();
	}
}
