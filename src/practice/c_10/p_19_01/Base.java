package practice.c_10.p_19_01;

import practice.c_10.p_19_01.Base.Inner1.Inner2;

public class Base {
	private static int i=13;
	
	public Base(int i){
		System.out.println("Base("+i+")");
	}
	
	public static int getVaue(){
		return i;
	}
	
	public class Inner1{
		private int x=10;
		
		public int getValue(){
			return x;
		}
		
		public class Inner2{
			private int n=13;
			
			public int getValue(){
				return n;
			}
		}
	}
	
	public static Inner1 getInner1(Base b){
		return (b.new Inner1());
	}
	
	public static Inner2 getInner2(Inner1 i){
		return (i.new Inner2());
	}
	
	public static void main(String[] args){
		Base b=new Base(1);
		Inner1 i1=getInner1(b);
		Inner2 i2=getInner2(i1);
		System.out.println(i1.getValue()+" "+i2.getValue());
	}
}
