package test.c_11.test_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
	public static void main(String[] args){
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		for(Integer i : list1){
			System.out.print(i+" ");
		}
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.addFirst(3);
		list2.addFirst(4);
		System.out.println("\n**************");
		for(Integer i : list1){
			System.out.print(i+" ");
		}
	}
}
