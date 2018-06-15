package test.c_11.adding_groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 向Collection中添加一组元素
 * Arrays.asList()	.addAll()	Collections.addAll()
 * @author mohan
 *
 */
public class AddingGroups {
	public static void main(String[] args){
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,3,5,7,9));
		System.out.println("***********************************");
		for(Integer i : collection){
			System.out.print(i+"  ");
		}
		Integer[] moreInts={2,4,6,8,10};
		collection.addAll(Arrays.asList(moreInts));
		System.out.println("\n***********************************");
		for(Integer i : collection){
			System.out.print(i+"  ");
		}
		Collections.addAll(collection, 11,13,15,16,19);
		System.out.println("\n***********************************");
		for(Integer i : collection){
			System.out.print(i+"  ");
		}
		Collections.addAll(collection, moreInts);
		System.out.println("\n***********************************");
		for(Integer i : collection){
			System.out.print(i+"  ");
		}
		List<Integer> list=Arrays.asList(12,14,16,18,30);
		System.out.println("\n***********************************");
		for(Integer i : list){
			System.out.print(i+"  ");
		}
		//元素替换
		list.set(2, 99);
		System.out.println("\n***********************************");
		for(Integer i : list){
			System.out.print(i+"  ");
		}
	}
}
