package practice.c_11.p_27;

import java.util.Queue;

public class Tester {
	public static void main(String[] args){
		Queue queue=FillQueue.fill();
		while(queue.peek()!=null){
			((Command) queue.poll()).operation();
		}
	}
}
