package practice.c_03.p_06;

public class Dog {
	private String name;
	private String says;
	Dog(){
		
	}
	Dog(String name, String says){
		this.name=name;
		this.says=says;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSays() {
		return says;
	}
	public void setSays(String says) {
		this.says = says;
	}
	
	public void bark(){
		System.out.println(name+" says: "+says);
	}
	
}
