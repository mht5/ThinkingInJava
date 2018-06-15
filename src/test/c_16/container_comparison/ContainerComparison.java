package test.c_16.container_comparison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayºÍList
 * @author mohan
 *
 */
class Apple{
	private static long counter;
	private final long id=counter++;
	
	public String toString(){
		return "Apple"+id;
	}
}

public class ContainerComparison {
	public static void main(String[] args){
		Apple[] apples=new Apple[10];
		for(int i=0;i<5;i++){
			apples[i]=new Apple();
		}
		System.out.println(Arrays.toString(apples));
		System.out.println(apples[4]);
		
		List<Apple> appleList=new ArrayList<Apple>();
		for(int i=0;i<5;i++){
			appleList.add(new Apple());
		}
		System.out.println(appleList);
		System.out.println(appleList.get(4));
		
		int[] integers={0,1,2,3,4,5};
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		
		List<Integer> intList=new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		intList.add(97);
		System.out.println(intList);
		System.out.println(intList.get(4));
	}
}
