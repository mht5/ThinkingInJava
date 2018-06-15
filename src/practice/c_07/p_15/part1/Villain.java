package practice.c_07.p_15.part1;

public class Villain {
	private String name;
	
	public Villain(String name){
		this.name=name;
	}
	
	protected void changeName(String name){
		this.name=name;
	}
	
	public String toString(){
		return "There's a villain by the name of "+name;
	}
}
