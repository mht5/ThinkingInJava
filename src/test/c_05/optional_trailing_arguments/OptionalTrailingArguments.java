package test.c_05.optional_trailing_arguments;

/**
 * �ɱ�����б����ñ���ΪString����
 * @author MOHAN
 *
 */
public class OptionalTrailingArguments {
	static void printInfo(int required, String... trailing){
		System.out.print("required: "+required+"  ");
		for(String s : trailing){
			System.out.print(s+"  ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		printInfo(1,"one");
		printInfo(2,"two","three");
		printInfo(0);
	}
}
