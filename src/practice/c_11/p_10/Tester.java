package practice.c_11.p_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Tester {
	public static void what(List<Rodent> list){
		Iterator i=list.iterator();
		while(i.hasNext()){
			((Rodent) i.next()).what();
		}
	}
	public static void main(String[] args){
		List<Rodent> list=new ArrayList<Rodent>();
		Collections.addAll(list, new Mouse(), new Gerbil(), new Hamster());
		what(list);
	}
}
