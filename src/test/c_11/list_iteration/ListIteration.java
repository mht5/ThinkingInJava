package test.c_11.list_iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator可以查看上一个，可以在创建时指定位置
 * @author mohan
 *
 */
public class ListIteration {
	public static void main(String[] args){
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(1,3,5,7,9));
		List<Integer> list2 = new ArrayList<Integer>();
//		指定当前指向的位置
		ListIterator li=list1.listIterator(5);
		while(li.hasPrevious()){
			list2.add((Integer) li.previous());
		}
		Iterator i=list2.iterator();
		while(i.hasNext()){
			System.out.print(i.next()+" ");
		}
	}
}
