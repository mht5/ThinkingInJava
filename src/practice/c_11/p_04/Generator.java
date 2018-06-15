package practice.c_11.p_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * ÃÓ≥‰List≤¢¥Ú”°
 * @author mohan
 *
 */
public class Generator {
	private static String[] s=new String[]{"a","b","c","d","e","f","g"};
	private static int i=0;
	
	static Collection next(Collection<String> collection){
		if(i>=s.length){
			i=0;
		}
		collection.add(s[i++]);
		return collection;
	}
	
	public static void main(String[] args){
		List<String> list1=new ArrayList<String>();
		next(next(next(next(list1))));
		for(String s : list1){
			System.out.print(s+" ");
		}
		
		List<String> list2=new LinkedList<String>();
		next(next(next(next(next(next(list2))))));
		System.out.println("\n********************");
		for(String s : list2){
			System.out.print(s+" ");
		}
		
		Set<String> set1=new HashSet<String>();
		next(next(next(next(next(next(next(next(next(set1)))))))));
		System.out.println("\n********************");
		for(String s : set1){
			System.out.print(s+" ");
		}
		
		Set<String> set2=new LinkedHashSet<String>();
		next(next(next(next(next(next(next(next(next(set2)))))))));
		System.out.println("\n********************");
		for(String s : set2){
			System.out.print(s+" ");
		}
		
		Set<String> set3=new TreeSet<String>();
		next(next(next(next(next(next(next(next(next(set3)))))))));
		System.out.println("\n********************");
		for(String s : set3){
			System.out.print(s+" ");
		}
	}
}
