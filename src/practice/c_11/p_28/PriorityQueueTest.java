package practice.c_11.p_28;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PriorityQueueTest {
	public static Queue fill(){
		Random rand=new Random();
		Queue<Double> queue=new PriorityQueue<Double>();
		for(int i=0;i<10;i++){
			queue.offer(rand.nextDouble()*100);
		}
		return queue;
	}
	
	public static void look(Queue queue){
		while(queue.peek()!=null){
			System.out.println(queue.poll());
		}
	}
	
	public static void main(String[] args){
		look(fill());
	}
}
