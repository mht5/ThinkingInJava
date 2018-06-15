package test.c_11.apples_and_oranges_with_generics;

import java.util.ArrayList;

import test.c_11.apples_and_oranges_without_generics.Apple;

public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
		}
		for(int i=apples.size()-1;i>=0;i--){
			System.out.println(apples.get(i).id());
		}
		for(Apple a : apples){
			System.out.println(a.id());
		}
	}
}
