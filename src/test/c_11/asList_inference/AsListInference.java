package test.c_11.asList_inference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}

public class AsListInference {
	public static void main(String[] args){
		List<Snow> snow1=Arrays.asList(new Powder(), new Crusty(), new Slush());
		System.out.println("***********************************");
		for(Snow s : snow1){
			System.out.println(s);
		}
//		因为参数是Powder类型的，所以会要求转换为List<Powder>
//		List<Snow> snow2=Arrays.asList(new Light(), new Heavy());
		List<Snow> snow3=new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		System.out.println("\n***********************************");
		for(Snow s : snow3){
			System.out.println(s);
		}
//		显式类型参数说明
		List<Snow> snow4=Arrays.<Snow>asList(new Light(), new Heavy());
		System.out.println("\n***********************************");
		for(Snow s : snow4){
			System.out.println(s);
		}
	}
}
