package test.c_05.static_initialization;

/**
 * ��̬�����ȵõ���ʼ������ֻ��ʼ��һ��
 * @author MOHAN
 *
 */
public class StaticInitialization {
	public static void main(String[] args){
		System.out.println("create a new cup board.");
		new CupBoard();
		System.out.println("create a new cup board.");
		new CupBoard();
		table.f2(2);
		cupBoard.f3(3);
	}
	static Table table=new Table();
	static CupBoard cupBoard=new CupBoard();
}
