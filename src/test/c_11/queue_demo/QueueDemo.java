package test.c_11.queue_demo;

import java.util.LinkedList;
import java.util.Queue;


/**
 * LinkedList实现了Queue接口
 * @author mohan
 *
 */
public class QueueDemo {
	public static void printQ(Queue q){
		while(q.peek()!=null){
			System.out.print(q.remove()+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Queue<Integer> queue1=new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			queue1.add(i*i*i);
		}
		printQ(queue1);
		Queue<Character> queue2=new LinkedList<Character>();
		for(char c : "Boromir".toCharArray()){
			queue2.add(c);
		}
		printQ(queue2);
	}
}
