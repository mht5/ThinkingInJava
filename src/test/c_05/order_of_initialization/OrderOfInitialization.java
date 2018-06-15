package test.c_05.order_of_initialization;

/**
 * 变量定义的先后顺序决定了初始化顺序
 * 即使变量定义散布在方法定义之间，他们仍旧会在任何方法（包括构造器）之前得到初始化
 * 初始化得到保证
 * @author MOHAN
 *
 */
public class OrderOfInitialization {
	public static void main(String[] args){
		House h=new House();
		h.test();
	}
}
