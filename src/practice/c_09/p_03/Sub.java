package practice.c_09.p_03;

/**
 * 创建对象时会先调用基类构造器，基类构造器中调用print()方法
 * @author mohan
 *
 */
public class Sub extends Super{
	public void print(){
		System.out.println(super.i);
	}
	
	public static void main(String[] args){
		(new Sub()).print();
	}
}
