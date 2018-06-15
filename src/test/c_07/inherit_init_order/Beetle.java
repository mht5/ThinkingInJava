package test.c_07.inherit_init_order;

/**
 * 加载一个类时如果发现有基类，会先加载基类
 * static初始化会先执行
 * @author mohan
 *
 */
public class Beetle extends Insect{
	private int k=printInit("Bettle.k initialized");
	
	public Beetle(){
		System.out.println("k="+k+"\nj="+j);
	}
	
	private static int x2=printInit("static Beetle.x2 initialized");
	
	public static void main(String[] args){
		System.out.println("Beetle constructor.");
		new Beetle();
	}
}
