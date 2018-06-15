package practice.c_04.p_03;

import java.util.ArrayList;
import java.util.Random;

public class CompareNumbers {
	public static void main(String[] args){
		int array1[] = new int[25];
		ArrayList<Integer> List1=new ArrayList<Integer>();
		ArrayList<Integer> List2=new ArrayList<Integer>();
		ArrayList<Integer> List3=new ArrayList<Integer>();
		while(true){
			Random rand=new Random();
			for(int i=0;i<25;i++){
				array1[i]=rand.nextInt(10000);
			}
			System.out.println("numbers: ");
			for(int i=0;i<array1.length-1;i++){
				System.out.println(array1[i]);
				if(array1[i]>array1[i+1]){
					List1.add(array1[i]);
				}
				else if(array1[i]<array1[i+1]){
					List2.add(array1[i]);
				}
				else{
					List3.add(array1[i]);
				}
			}
			System.out.println("\nbigger than next: ");
			for(int i=0;i<List1.size();i++){
				System.out.println(List1.get(i));
			}
			System.out.println("\nlesser than next: ");
			for(int i=0;i<List2.size();i++){
				System.out.println(List2.get(i));
			}
			System.out.println("\nequal to next: ");
			for(int i=0;i<List3.size();i++){
				System.out.println(List3.get(i));
			}
		}
	}
}
