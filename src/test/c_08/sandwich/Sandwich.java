package test.c_08.sandwich;

/**
 * ��ʼ������ľ�̬��->��ʼ�������ྲ̬��->��ʼ���������->���๹����->��ʼ�����������->�����๹����
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
