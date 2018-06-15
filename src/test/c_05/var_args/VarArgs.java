package test.c_05.var_args;

/**
 * 可变参数列表(放在数组中)
 * @author MOHAN
 *
 */
class A{}

public class VarArgs {
	static void printArray(Object[] arg){
		for(Object obj : arg){
			System.out.print(obj+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		printArray(new Object[]{new Integer(12),false,new String("sam")});
		printArray(new Object[]{"mohan","sam"});
		printArray(new Object[]{new A(),new A(),new A()});
	}
}
