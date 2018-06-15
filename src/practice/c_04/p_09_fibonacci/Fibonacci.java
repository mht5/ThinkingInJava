package practice.c_04.p_09_fibonacci;

import java.util.ArrayList;

public class Fibonacci {
	static ArrayList<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args){
		list=getArray(20);
		for(int x : list){
			System.out.print(x+" ");
		}
	}
	
	static ArrayList<Integer> getArray(int num){
		int i=1,j=1,k;
		list.add(i);
		list.add(j);
		for(;list.size()<num;){
			k=i+j;
			i=j;
			j=k;
			list.add(k);
		}
		return list;
	}
}
