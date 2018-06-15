package test.c_08.sandwich;

/**
 * 初始化基类的静态域->初始化导出类静态域->初始化基类变量->基类构造器->初始化导出类变量->导出类构造器
 * @author mohan
 *
 */
public class Sandwich extends PortableLunch{
	private Bread b=new Bread();
	private static Cheese c=new Cheese();
	private Lettuce l=new Lettuce();
	
	public Sandwich(){
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args){
		new Sandwich();
	}
}
