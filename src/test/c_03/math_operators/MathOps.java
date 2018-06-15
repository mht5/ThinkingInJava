package test.c_03.math_operators;

import java.util.Random;

public class MathOps {
	public static void main(String[] args){
		Random rand=new Random(47);
		
		int i,j,k;
		i=rand.nextInt(100)+1;
		System.out.println("i="+i);
		j=rand.nextInt(100)+1;
		System.out.println("j="+j);
		k=i+j;
		System.out.println("i+j="+k);
		k=i-j;
		System.out.println("i-j="+k);
		k=i*j;
		System.out.println("i*j="+k);
		k=i/j;
		System.out.println("i/j="+k);
		k=i%j;
		System.out.println("i%j="+k+"\n");
		
		float x,y,z;
		x=rand.nextFloat();
		System.out.println("x="+x);
		y=rand.nextFloat();
		System.out.println("y="+y);
		z=x+y;
		System.out.println("x+y="+z);
		z=x-y;
		System.out.println("x-y="+z);
		z=x*y;
		System.out.println("x*y="+z);
		z=x/y;
		System.out.println("x/y="+z);

		z+=x;
		System.out.println("z+=x: "+z);
		z-=x;
		System.out.println("z-=x: "+z);
		z*=x;
		System.out.println("z*=x: "+z);
		z/=x;
		System.out.println("z/=x: "+z);
	}
}
