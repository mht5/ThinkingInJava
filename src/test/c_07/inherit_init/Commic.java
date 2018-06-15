package test.c_07.inherit_init;

/**
 * 基类在导出类之前初始化
 * @author mohan
 *
 */
public class Commic extends Drawing{
	public Commic(){
		System.out.println("Commic constructor.");
	}
	
	public static void main(String[] args){
		new Commic();
	}
}
