package practice.c_11.p_08;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args){
		ArrayList<Gerbil> list=new ArrayList<Gerbil>();
		for(int i=0;i<6;i++){
			list.add(new Gerbil());
		}
		Iterator i=list.iterator();
		while(i.hasNext()){
			((Gerbil) i.next()).hop();
		}
	}
}
