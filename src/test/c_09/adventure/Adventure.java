package test.c_09.adventure;

public class Adventure {
	public static void fight(CanFight x){
		x.fight();
	}
	
	public static void swim(CanSwim x){
		x.swim();
	}
	
	public static void fly(CanFly x){
		x.fly();
	}
	
	public static void drink(CanDrink x){
		x.drink();
	}
	
	public static void aFight(ActionCharacter x){
		x.fight();
	}
	
	public static void main(String[] args){
		Hero h=new Hero();
		fight(h);
		swim(h);
		fly(h);
		drink(h);
		aFight(h);
	}
}
