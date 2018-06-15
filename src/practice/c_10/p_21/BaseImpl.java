package practice.c_10.p_21;

/**
 * 接口的实现(调用接口中(定义的嵌套类中(的调用接口方法的方法)))
 * @author mohan
 *
 */
public class BaseImpl implements Base{
	public void print(){
		System.out.println(getClass().getSimpleName());
	}
	
	public static void main(String[] args){
		Tester.print(new BaseImpl());
	}
}
