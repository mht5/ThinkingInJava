package test.c_08.covariant_return;

/**
 * Э�䷵�����ͣ��������еı����Ƿ������Է��ػ��෽���������͵ĵ�������
 * WheatMill.process()���Է���Mill.process()��������Grain�ĵ�������Wheat
 * @author mohan
 *
 */
public class CovariantReturn {
	public static void main(String[] args){
		System.out.println((new Mill()).process());
		System.out.println((new WheatMill()).process());
	}
}
