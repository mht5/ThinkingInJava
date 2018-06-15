package test.c_16.array_of_generics;

import java.util.ArrayList;
import java.util.List;

import test.c_16.array_options.Apple;

/**
 * 创建非泛型数组，然后转型为泛型
 * @author mohan
 *
 */
public class ArrayOfGenerics {
	public static void main(String[] args){
		List<String>[] la;
		List[] ls=new List[10];
		la=(List<String>[])ls;
		for(int i=0;i<la.length;i++){
			la[i]=new ArrayList<String>();
		}
		
		List<Apple>[] apples=(List<Apple>[])new List[10];
		for(int i=0;i<apples.length;i++){
			apples[i]=new ArrayList<Apple>();
		}
	}
}
