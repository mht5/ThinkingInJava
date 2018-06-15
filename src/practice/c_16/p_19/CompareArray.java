package practice.c_16.p_19;

import java.util.Arrays;

public class CompareArray {
	public static void main(String[] args){
		Apple[] a1=new Apple[6];
		Apple[] a2=new Apple[6];
		for(int i=0;i<6;i++){
			a1[i]=new Apple(6);
			a2[i]=new Apple(6);
		}
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		System.out.println(Arrays.equals(a1, a2));
		System.out.println(equals(a1, a2));
	}
	
	public static boolean equals(Apple[] a1, Apple[] a2){
		boolean flag=true;
		for(int i=0;i<a1.length;i++){
			if(!(a1[i].toString().equals(a2[i].toString()))){
				flag=false;
			}
		}
		return flag;
	}
}
