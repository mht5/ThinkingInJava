package practice.c_11.p_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Tester {
	public static void main(String[] args){
		Map<String,Gerbil> map=new HashMap<String,Gerbil>();
		Gerbil g1=new Gerbil("a");
		Gerbil g2=new Gerbil("b");
		Gerbil g3=new Gerbil("c");
		Gerbil g4=new Gerbil("d");
		Gerbil g5=new Gerbil("ae");
		map.put("a", g1);
		map.put("b", g2);
		map.put("c", g3);
		map.put("d", g4);
		map.put("e", g5);
		Iterator i=map.keySet().iterator();
		while(i.hasNext()){
			String s=(String) i.next();
			Gerbil g=map.get(s);
			System.out.println(s+"="+g);
			g.hop();
		}
	}
}
