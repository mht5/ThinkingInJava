package practice.c_07.p_21;

/**
 * ʹ��final�����ķ���(��private)���ɸ���
 * private������ʽָ��Ϊfinal
 * �������������ͬ����ǩ�������ͻ���һ����(final������private����)����ʵ����ֻ�����´�����һ����������û�и���
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
