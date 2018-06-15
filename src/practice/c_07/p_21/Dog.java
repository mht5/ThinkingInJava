package practice.c_07.p_21;

/**
 * 使用final声明的方法(非private)不可覆盖
 * private方法隐式指定为final
 * 导出类可以用相同方法签名创建和基类一样的(final声明的private方法)，但实际上只是重新创建了一个方法，并没有覆盖
 * @author mohan
 *
 */
public class Dog extends Animal{
	public static final void makeSound(){
		System.out.println("Wurf!");
	}
	
	public static void main(String[] args){
		makeSound();
	}
}
