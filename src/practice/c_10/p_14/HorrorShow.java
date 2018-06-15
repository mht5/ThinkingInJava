package practice.c_10.p_14;

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
	
	public static DangerousMonster getDangerousMonster(){
		return new DangerousMonster(){
			public void menace() {
				System.out.println("menace1()");
			}
			
			public void destroy(){
				System.out.println("destroy1()");
			}
		};
	}
	
	public static Vampire getVampire(){
		return new Vampire(){
			public void destroy() {
				System.out.println("destroy2()");
			}
			
			public void menace() {
				System.out.println("menace2()");
			}
			
			public void kill() {
				System.out.println("kill2()");
			}
			
			public void drinkBlood() {
				System.out.println("drinkBlood2()");
			}
		};
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
		System.out.println("**************");
		d=getDangerousMonster();
		menace(d);
		destroy(d);
		v=getVampire();
		menace(v);
		destroy(v);
		kill(v);
		drinkBlood(v);
	}
}
