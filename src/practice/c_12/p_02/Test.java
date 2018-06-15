package practice.c_12.p_02;

public class Test {
	public static void main(String[] args){
		Dog d=null;
		try{
			d.bark();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
