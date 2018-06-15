package practice.c_12.p_17;

public class Animal extends LivingCreature{
	private Characteristic c=new Characteristic("has heart.");
	private Description d=new Description("Animal not vegetable.");
	
	public Animal(){
		System.out.println("Animal()");
	}

	protected void dispose(){
		System.out.println("disposing animal");
		d.dispose();
		c.dispose();
		super.dispose();
	}
}
