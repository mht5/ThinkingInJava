package practice.c_12.p_08;

public class Test {
	public static void test() throws NullPointerException{
		Dog d=null;
		d.bark();
	}
	
	public static void main(String[] args){
		try{
			test();
		}catch(NullPointerException e){
			e.printStackTrace();
		}
	}
}
