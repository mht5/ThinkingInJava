package test.c_09.adventure;

/**
 * ��Ͼ�����ͽӿ�
 * @author mohan
 *
 */
public class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly,CanDrink{
	public void swim(){
		System.out.println("swim()");
	}
	
	public void fly(){
		System.out.println("fly()");
	}
	
	public void drink(){
		System.out.println("drink()");
	}
}
