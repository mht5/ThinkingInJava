package practice.c_09.p_03;

/**
 * ��������ʱ���ȵ��û��๹���������๹�����е���print()����
 * @author mohan
 *
 */
public class Sub extends Super{
	public void print(){
		System.out.println(super.i);
	}
	
	public static void main(String[] args){
		(new Sub()).print();
	}
}
