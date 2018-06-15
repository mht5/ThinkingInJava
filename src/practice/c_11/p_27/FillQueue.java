package practice.c_11.p_27;

import java.util.LinkedList;
import java.util.Queue;

public class FillQueue {
	public static Queue<Command> fill(){
		Queue<Command> queue=new LinkedList<Command>();
		for(int i=0;i<6;i++){
			String s="command"+i;
			queue.add(new Command(s));
		}
		return queue;
	}
}
