package test.c_11.array_is_not_iterable;

import java.util.Arrays;

/**
 * foreach���������κ��������Iterable�������鲢����Iterable
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
