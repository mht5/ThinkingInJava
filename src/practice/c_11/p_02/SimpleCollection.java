package practice.c_11.p_02;

import java.util.HashSet;
import java.util.Set;

/**
 * Set�������ظ�Ԫ��
 * @author mohan
 *
 */
public class SimpleCollection {
	public static void main(String[] args){
		Set<Integer> c=new HashSet<Integer>();
		for(int i=0;i<10;i++){
			c.add(1);
		}
		for(Integer i : c){
			System.out.println(i);
		}
	}
}
