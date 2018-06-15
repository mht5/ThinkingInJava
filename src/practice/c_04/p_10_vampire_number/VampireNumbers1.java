package practice.c_04.p_10_vampire_number;

import java.util.Arrays;

public class VampireNumbers1 {
	public static void main(String[] args){
		String[] str1,str2;
		int sum=0,count=0;
		int total;
		for(int i=10;i<100;i++){
			//j=i+1避免重复
			for(int j=i+1;j<100;j++){
				total=i*j;
				count++;
//				System.out.println(i+"*"+j+"="+total);
				/*
				 * 假设val = 1000a + 100b + 10c + d, 因为满足val = x * y, 则有x = 10a + b, y = 10c + d
				 *	则val - x - y = 990a + 99b + 9c = 9 * (110a + 11b + c), 所以val - x - y能被9整除。
				 *	所以满足该条件的数字必定能被9整除，所以可以直接过滤其他数字。
				*/ 
				if((total%100==0)||((total-i-j)%9!=0)){
					continue;
				}
				str1=String.valueOf(total).split("");
				str2=(String.valueOf(i)+String.valueOf(j)).split("");
				Arrays.sort(str1);
				Arrays.sort(str2);
				if(Arrays.equals(str1, str2)){
					System.out.println("**********************");
					System.out.println("第"+(++sum)+"组: "+i+"*"+j+"="+total);
					System.out.println("**********************");
				}
			}
		}
		System.out.println("共找到"+sum+"组吸血鬼数，循环"+count+"次。");
	}
}
