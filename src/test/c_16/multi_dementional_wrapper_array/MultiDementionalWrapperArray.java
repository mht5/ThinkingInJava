package test.c_16.multi_dementional_wrapper_array;

import java.util.Arrays;

public class MultiDementionalWrapperArray {
	public static void main(String[] args){
		Integer[][] a={{1,3,5,7,9},{0,2,4,6,8}};
		double[][][] b={{{1.1,2.2},{3.3,4.4}},{{5.5,6.6},{7.7,8.8}}};
		String[][] c={
				{"The","quick","sly","fox"},
				{"jumped","over"},
				{"the","lazy","brown","dog","and","friends"}
		};

		System.out.println("a: "+Arrays.deepToString(a));
		System.out.println("b: "+Arrays.deepToString(b));
		System.out.println("c: "+Arrays.deepToString(c));
	}
}
