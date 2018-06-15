package test.c_11.set_of_integer_sorted;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set�������ظ�Ԫ��
 * TreeSet���Ԫ�ؽ�������
 * @author mohan
 *
 */
public class SortedSetOfInteger {
	public static void main(String[] args){
		Random rand=new Random();
		Set<Integer> intSet=new TreeSet<Integer>();
		for(int i=0;i<100;i++){
			intSet.add(rand.nextInt(43));
		}
		System.out.println(intSet.size());
		for(Integer i : intSet){
			System.out.print(i+" ");
		}
	}
}
