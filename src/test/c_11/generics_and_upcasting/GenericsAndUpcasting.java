package test.c_11.generics_and_upcasting;

import java.util.ArrayList;

import test.c_11.apples_and_oranges_without_generics.Apple;

class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class Breaburn extends Apple{}

public class GenericsAndUpcasting {
	public static void main(String[] args){
		ArrayList<Apple> apples=new ArrayList<Apple>();
		apples.add(new Apple());
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Breaburn());
		for(Apple a : apples){
			System.out.println(a);
		}
	}
}
