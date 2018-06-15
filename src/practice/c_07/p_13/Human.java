package practice.c_07.p_13;

public class Human {
	public void eat(String s){
		System.out.println("The guy is eating "+s);
	}
	
	public void eat(double d){
		System.out.println("The Guy is eating "+d+" yuan worth of something.");
	}
	
	public void eat(String s, int i){
		System.out.println("THe guy has just eat "+i+" "+s+".");
	}
}
