package test.c_05.var_args_new;

/**
 * 可变参数列表(直接接收多个参数或接收0个参数)
 * @author MOHAN
 *
 */
public class NewVarArgs {
	static void printArray(Object... arg){
		for(Object o : arg){
			System.out.println(o);
		}
		System.out.println("*********");
	}
	
	public static void main(String[] args){
		printArray("sam","mohan");
		printArray(new Integer(12),10.24,"mohan");
		printArray();
	}
}
