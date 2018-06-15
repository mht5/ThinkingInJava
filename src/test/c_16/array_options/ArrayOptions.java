package test.c_16.array_options;

import java.util.Arrays;

/**
 * 对象数组保存引用，基本类型数组直接保存值
 * @author mohan
 *
 */
public class ArrayOptions {
	public static void main(String[] args){
		Apple[] a;
		Apple[] b=new Apple[6];
		System.out.println("b: "+Arrays.toString(b));
		Apple[] c=new Apple[7];
		for(int i=0;i<c.length;i++){
			c[i]=new Apple();
		}
		Apple[] d={new Apple(), new Apple(), new Apple()};
		a=new Apple[]{new Apple(), new Apple(), new Apple(), new Apple()};
		
		System.out.println("a.length="+a.length);
		System.out.println("b.length="+b.length);
		System.out.println("c.length="+c.length);
		System.out.println("d.length="+d.length);
		
		a=d;
		System.out.println("a.length="+a.length);
		System.out.println("a: "+Arrays.toString(a));
		a=c;
		System.out.println("a.length="+a.length);
		System.out.println("a: "+Arrays.toString(a));
		
		int[] e;
		int[] f=new int[5];
		System.out.println("f: "+Arrays.toString(f));
		int[] g=new int[6];
		for(int i=0;i<g.length;i++){
			g[i]=i*i*i;
		}
		int[] h={1,3,5,7,9};
//		System.out.println("e.length="+e.length);
		System.out.println("f.length="+f.length);
		System.out.println("g.length="+g.length);
		System.out.println("h.length="+h.length);
		e=h;
		System.out.println("e.length="+e.length);
		e=new int[]{2,4,6,8,10,12,14,16};
		System.out.println("e.length="+e.length);
	}
}
