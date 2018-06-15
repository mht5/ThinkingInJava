package practice.c_12.p_17;

public class Amphibian extends Animal{
	private Characteristic c=new Characteristic("can live in water.");
	private Description d=new Description("Both water and land.");
	
	public Amphibian(){
		System.out.println("Amphibian");
	}

	protected void dispose(){
		System.out.println("disposing amphibian");
		d.dispose();
		c.dispose();
		super.dispose();
	}
}
