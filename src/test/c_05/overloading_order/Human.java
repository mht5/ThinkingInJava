package test.c_05.overloading_order;

public class Human {
	String name;
	
	Human(String name){
		this.name=name;
	}
	
	public void eat(){
		System.out.println(name+" eat nothing.");
	}
	
	public void eat(String meal){
		System.out.println(name+" eat "+meal+".");
	}
	
	public void eat(int i, String meal){
		System.out.println(name+" eat "+meal+"*"+i+".");
	}
	
	public void eat(String meal, int i){
		System.out.println(name+" eat "+meal+" "+i+" times.");
	}
}
