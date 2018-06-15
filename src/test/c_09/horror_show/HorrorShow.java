package test.c_09.horror_show;

public class HorrorShow {
	public static void menace(Monster m){
		m.menace();
	}
	
	public static void destroy(DangerousMonster d){
		d.destroy();
	}
	
	public static void kill(Lethal l){
		l.kill();
	}
	
	public static void drinkBlood(Vampire v){
		v.drinkBlood();
	}
	
	public static void main(String[] args){
		DangerousMonster d=new Elephant();
		menace(d);
		destroy(d);
		Vampire v=new BadVampire();
		menace(v);
		destroy(v);
		kill(v);
		drinkBlood(v);
	}
}
