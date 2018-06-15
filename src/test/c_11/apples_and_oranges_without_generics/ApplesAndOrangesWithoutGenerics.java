package test.c_11.apples_and_oranges_without_generics;

import java.util.ArrayList;

/**
 * ArrayListÄ¬ÈÏ×°Object
 * @author mohan
 *
 */
public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		ArrayList apples=new ArrayList();
		for(int i=0;i<3;i++){
			apples.add(new Apple());
		}
		apples.add(new Orange());
		for(int i=apples.size()-1;i>=0;i--){
			System.out.println(apples.get(i));
		}
		for(int i=0;i<apples.size();i++){
			System.out.println(((Apple)apples.get(i)).id());
		}
	}
}
