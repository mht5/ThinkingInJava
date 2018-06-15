package test.c_07.inherit_constructor_with_params;

/**
 * if((没有默认基类构造器)||(想要调用带参的基类构造器))	必须用关键字super显式调用基类构造器
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
