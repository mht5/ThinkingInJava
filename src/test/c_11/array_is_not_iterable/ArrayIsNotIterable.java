package test.c_11.array_is_not_iterable;

import java.util.Arrays;

/**
 * foreach可以用于任何数组或者Iterable，但数组并不是Iterable
 * @author mohan
 *
 */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib){
		for(T t : ib){
			System.out.println(t);
		}
	}
	
	public static void main(String[] args){
		test(Arrays.asList(1,2,3));
		String[] strings={"A","B","C"};
//		test(strings);
		test(Arrays.asList(strings));
	}
}
