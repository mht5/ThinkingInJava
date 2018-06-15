package test.c_10.class_in_interface;

/**
 * 接口内部嵌套类实现该接口
 * 如果需要创建公用的代码，使它们可以被接口的的不同实现共用，可以使用接口嵌套类
 * @author mohan
 *
 */
public interface ClassInInterface {
	public void howdy();
	
	public static class Test implements ClassInInterface{
		public void howdy(){
			System.out.println("Howdy!");
		}
		
		public static void main(String[] args){
			new Test().howdy();
		}
	}
}
