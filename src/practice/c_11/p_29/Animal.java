package practice.c_11.p_29;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 无法将(不包含任何成员的简单类)的多个成员添加到PriorityQueue
 * @author mohan
 *
 */
class Dog{}

public class Animal {
	public static Queue fill(){
		Queue<Dog> queue=new PriorityQueue<Dog>();
		for(int i=0;i<6;i++){
			queue.offer(new Dog());
		}
		return queue;
	}
	
	public static void main(String[] args){
		Queue queue=fill();
		while(queue.peek()!=null){
			System.out.println(queue.poll());
		}
	}
}
