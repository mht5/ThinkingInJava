package test.c_07.orc;

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
