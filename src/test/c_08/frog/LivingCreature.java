package test.c_08.frog;

public class LivingCreature {
	private Characteristic c=new Characteristic("is alive.");
	private Description d=new Description("Basic living creature.");
	
	public LivingCreature(){
		System.out.println("LivingCreature()");
	}
	
	protected void dispose(){
		System.out.println("disposing living creature");
		d.dispose();
		c.dispose();
	}
}
