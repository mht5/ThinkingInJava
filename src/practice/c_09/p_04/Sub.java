package practice.c_09.p_04;

public class Sub extends Super{
	public void print(){
		System.out.println(this);
	}
	
	public static void say(Super s){
		s.print();
	}
	
	public static void main(String[] args){
		say(new Sub());
	}
}
