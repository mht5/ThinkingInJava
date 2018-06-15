package practice.c_11.p_09;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	public static void main(String[] args){
		Sequence sequence=new Sequence();
		for(int i=0;i<20;i++){
			sequence.add(Integer.toString(i));
		}
		Iterator i=items.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
