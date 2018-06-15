package practice.c_16.p_18;

import java.util.Arrays;

class Apple{}

/**
 * System.arraycopy的复制时浅复制，即只是添加了一个新的引用
 * @author mohan
 *
 */
public class CopyObjectArray {
	public static void main(String[] args){
		Apple[] a1=new Apple[6];
		for(int i=0;i<a1.length;i++){
			a1[i]=new Apple();
		}
		System.out.println(Arrays.toString(a1));
		Apple[] a2=new Apple[6];
		System.out.println(Arrays.toString(a2));
		System.arraycopy(a1, 0, a2, 0, a1.length);
		System.out.println(Arrays.toString(a2));
	}
}
