package practice.c_16.p_10;

import java.util.ArrayList;
import java.util.List;

import test.c_16.array_options.Apple;

public class ArrayOfGenerics {
	public static void main(String[] args){
		List<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<10;i++){
			apples.add(new Apple());
		}
		System.out.println(apples);
	}
}
