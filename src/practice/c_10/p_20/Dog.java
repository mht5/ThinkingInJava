package practice.c_10.p_20;

public interface Dog {
	String bark="Wurf!";
	public void bark();
	
	public static class Barker implements Dog{
		public void bark(){
			System.out.println(bark);
		}
		
		public static void main(String[] args){
			new Barker().bark();
		}
	}
}
