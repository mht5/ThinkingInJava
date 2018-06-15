package practice.c_11.p_29;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * �޷���(�������κγ�Ա�ļ���)�Ķ����Ա��ӵ�PriorityQueue
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
