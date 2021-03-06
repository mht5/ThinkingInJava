package test.c_07.orc;

public class Orc extends Villain{
	private int number;
	
	public Orc(String name, int number){
		super(name);
		this.number=number;
	}
	
	public void update(String name, int number){
		changeName(name);
		this.number=number;
	}
	
	public String toString(){
		return "orcNumber: "+number+" "+super.toString();
	}
	
	public static void main(String[] args){
		Orc orc=new Orc("Morguls",1);
		System.out.println(orc);
		orc.update("Bonas",2);
		System.out.println(orc);
	}
}
