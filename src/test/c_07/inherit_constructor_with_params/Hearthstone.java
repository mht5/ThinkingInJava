package test.c_07.inherit_constructor_with_params;

/**
 * if((û��Ĭ�ϻ��๹����)||(��Ҫ���ô��εĻ��๹����))	�����ùؼ���super��ʽ���û��๹����
 * @author mohan
 *
 */
public class Hearthstone extends OnlineGame{
	public Hearthstone(int i){
		super(i);
		System.out.println("Hearthstone constructor.");
	}
	
	public static void main(String[] args){
		new Hearthstone(12);
	}
}
