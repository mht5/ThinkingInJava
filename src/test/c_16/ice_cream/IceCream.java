package test.c_16.ice_cream;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
	private static Random rand=new Random();
	static final String[] flavors={"Choclate", "Mint Chip", "Strawberry", "Rum", "Vanilla", "Mocha", "Proline"};
	
	public static String[] pick(int n){
		if(n>flavors.length){
			throw new IllegalArgumentException("too long for flavors.");
		}
		String[] result=new String[n];
		boolean[] picked=new boolean[flavors.length];
		for(int i=0;i<n;i++){
			int t;
			do{
				t=rand.nextInt(flavors.length);
			}while(picked[t]);
			result[i]=flavors[t];
			picked[t]=true;
		}
		return result;
	}
	
	public static void main(String[] args){
		for(int i=0;i<6;i++){
			System.out.println(Arrays.toString(pick(3)));
		}
	}
}
