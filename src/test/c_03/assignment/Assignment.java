package test.c_03.assignment;

import java.util.Scanner;

/**
 * 赋值操作是对象的引用
 * @author mohan
 *
 */
public class Assignment {
	public static void main(String[] args){
		Tank t1=new Tank();
		Tank t2=new Tank();
		t1.level=12;
		t2.level=26;
		System.out.println("1: t1.level="+t1.level+", t2.level="+t2.level);
		
		System.out.print("input 1 or 2: ");
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		if(i==1){
//			将t2赋值给t1后，它们指向相同的对象
			t1=t2;
			System.out.println("2: t1.level="+t1.level+", t2.level="+t2.level+"\n");
			
			t1.level=18;
			System.out.println("3: t1.level="+t1.level+", t2.level="+t2.level+"\n");
		}
		else{
			t1.level=t2.level;
			System.out.println("4: t1.level="+t1.level+", t2.level="+t2.level+"\n");
			
			t1.level=10;
			System.out.println("5: t1.level="+t1.level+", t2.level="+t2.level+"\n");
		}
	}
}
