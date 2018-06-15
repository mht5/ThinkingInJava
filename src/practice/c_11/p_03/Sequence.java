package practice.c_11.p_03;

import java.util.ArrayList;
import java.util.List;

/**
 * 内部类可以访问外围对象的所有成员
 * @author mohan
 *
 */
public class Sequence {
	private static List<Object> items=new ArrayList<Object>();
	
	public void add(Object x){
		items.add(x);
	}
	
	private static class SequenceSelector implements Selector{
		private int i=0;
		
		@Override
		public boolean end() {
			//引用外围对象的private字段
			return (i==items.size());
		}

		@Override
		public Object current() {
			return items.get(i);
		}

		@Override
		public void next() {
			if(i<items.size()){
				i++;
			}
		}
	}
	
	public static Selector selector(){
		return (new SequenceSelector());
	}
	
	public static void main(String[] args){
		Sequence sequence=new Sequence();
		for(int i=0;i<20;i++){
			sequence.add(Integer.toString(i));
		}
		Selector selector=Sequence.selector();
		while(!selector.end()){
			System.out.print(selector.current()+" ");
			selector.next();
		}
	}
}
