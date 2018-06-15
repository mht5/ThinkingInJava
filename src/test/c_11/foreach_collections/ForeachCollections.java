package test.c_11.foreach_collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Collection对象可以通过foreach遍历
 * @author mohan
 *
 */
public class ForeachCollections {
	public static void main(String[] args){
		List<String> list=new LinkedList<String>();
		Collections.addAll(list, "What is going to happen".split(" "));
		for(String s : list){
			System.out.println(s);
		}
	}
}
