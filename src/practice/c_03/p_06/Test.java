package practice.c_03.p_06;

public class Test {
	public static void main(String[] args){
		Dog d1=new Dog("Spot","Ruff!");
		Dog d2=new Dog("Scruffy","Wurf!");
		d1.bark();
		d2.bark();
		
		Dog d3=new Dog("Spot","Ruff!");
		System.out.println(d3==d1);
//		Dog是自定义类型，equals()没有被重写，所以意义与"=="相同
		System.out.println(d3.equals(d1));
		d3=d1;
		System.out.println(d3==d1);
		System.out.println(d3.equals(d1));
	}
}
