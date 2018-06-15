package test.c_11.priority_queue_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

/**
 * PriorityQueue会对队列中的对象进行排序
 * @author mohan
 *
 */
public class PriorityQueueDemo {
	public static void printQ(Queue q){
		while(q.peek()!=null){
			System.out.print(q.remove()+" ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		PriorityQueue<Integer> queue1=new PriorityQueue<Integer>();
		Random rand=new Random();
		for(int i=0;i<10;i++){
			queue1.add(rand.nextInt(23)^2);
		}
		
		printQ(queue1);
		List<Integer> ints=Arrays.asList(25,21,43,54,34,56,76,32,1,23,17,19,11);
		queue1=new PriorityQueue<Integer>(ints);
		printQ(queue1);
		queue1=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
		queue1.addAll(ints);
		printQ(queue1);
		
		String s="EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings=Arrays.asList(s.split(""));
		PriorityQueue<String> queue2=new PriorityQueue<String>(strings);
		printQ(queue2);
		queue2=new PriorityQueue<String>(strings.size(),Collections.reverseOrder());
		queue2.addAll(strings);
		printQ(queue2);
		
		Set<Character> charSet=new HashSet<Character>();
		for(Character c : s.toCharArray()){
			charSet.add(c);
		}
		PriorityQueue<Character> queue3=new PriorityQueue<Character>(charSet);
		printQ(queue3);
	}
}
