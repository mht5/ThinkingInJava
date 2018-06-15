package practice.c_10.p_03;

public class Outer {
	private static String what;
	
	public Outer(){
		what="Outer";
	}
	
	class Inner{
		public Inner(){
			System.out.println("Inner constructor.");
		}
		
		public String toString(){
			return what;
		}
	}
	
	public void getIn(){
		System.out.println((new Inner()).toString());
	}
	
	public static void main(String[] args){
		(new Outer()).getIn();
	}
}
