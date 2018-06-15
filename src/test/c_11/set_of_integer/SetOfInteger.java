package test.c_11.set_of_integer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Set不保存重复元素
 * @author mohan
 *
 */
public class SetOfInteger {
	public static void main(String[] args){
		Random rand=new Random();
		Set<Integer> intSet=new HashSet<Integer>();
		for(int i=0;i<100;i++){
			intSet.add(rand.nextInt(43));
		}
		System.out.println(intSet.size());
		for(Integer i : intSet){
			System.out.print(i+" ");
		}
	}
}
