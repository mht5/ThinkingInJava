package test.c_16.multi_dementional_object_array;

import java.util.Arrays;

import test.c_16.array_options.Apple;

public class MultiDementionalObjectArray {
	public static void main(String[] args){
		Apple[][] apples={{new Apple(), new Apple(), new Apple()},{new Apple(), new Apple()}};
		System.out.println(Arrays.deepToString(apples));
	}
}
