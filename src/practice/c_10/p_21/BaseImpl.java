package practice.c_10.p_21;

/**
 * �ӿڵ�ʵ��(���ýӿ���(�����Ƕ������(�ĵ��ýӿڷ����ķ���)))
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
