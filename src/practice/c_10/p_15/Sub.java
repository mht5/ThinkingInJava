package practice.c_10.p_15;

public class Sub {
	public static Base getBase(int i){
		return new Base(i){
			public void f(){
				System.out.println("f()");
			}
		};
	}
	
	public static void main(String[] args){
		getBase(13).f();
	}
}
