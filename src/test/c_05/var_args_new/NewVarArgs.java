package test.c_05.var_args_new;

/**
 * �ɱ�����б�(ֱ�ӽ��ն�����������0������)
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
