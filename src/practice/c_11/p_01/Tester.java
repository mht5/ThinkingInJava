package practice.c_11.p_01;

import java.util.ArrayList;

public class Tester {
	public static void main(String[] args){
		ArrayList<Gerbil> list=new ArrayList<Gerbil>();
		for(int i=0;i<6;i++){
			list.add(new Gerbil());
		}
		for(int i=list.size()-1;i>=0;i--){
			list.get(i).hop();
		}
	}
}
