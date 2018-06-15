package practice.c_10.p_18;

public class Base {
	private static int i=13;
	
	public Base(int i){
		System.out.println("Base("+i+")");
	}
	
	public static int getVaue(){
		return i;
	}
	
	public static class Inner{
		private static int x=10;
		
		public static int getValue(){
			return x;
		}
	}
	
	public static Inner getInner(){
		return (new Inner());
	}
	
	public static void main(String[] args){
		System.out.println(getInner().getValue());
	}
}
