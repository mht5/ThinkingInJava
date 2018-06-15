package practice.c_10.p_19_02;

import practice.c_10.p_19_02.Base.Inner1.Inner2;

public class Base {
	private static int i=13;
	
	public Base(int i){
		System.out.println("Base("+i+")");
	}
	
	public static int getVaue(){
		return i;
	}
	
	public static class Inner1{
		private int x=10;
		
		public int getValue(){
			return x;
		}
		
		public static class Inner2{
			private int n=13;
			
			public int getValue(){
				return n;
			}
		}
	}
	
	public static Inner1 getInner1(){
		return (new Inner1());
	}
	
	public static Inner2 getInner2(){
		return (new Inner2());
	}
	
	public static void main(String[] args){
		Inner1 i1=getInner1();
		Inner2 i2=getInner2();
		System.out.println(i1.getValue()+" "+i2.getValue());
	}
}
