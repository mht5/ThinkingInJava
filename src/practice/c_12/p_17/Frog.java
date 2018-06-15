package practice.c_12.p_17;

public class Frog extends Amphibian{
	private Characteristic c=new Characteristic("crocks.");
	private Description d=new Description("Eats bugs.");
	
	public Frog(){
		System.out.println("Frog()");
	}

	protected void dispose(){
		System.out.println("disposing frog");
		d.dispose();
		c.dispose();
		super.dispose();
	}
	
	public static void main(String[] args){
		Frog frog=new Frog();
		try{
			System.out.println("hahah");
		}finally{
			frog.dispose();
		}
	}
}
