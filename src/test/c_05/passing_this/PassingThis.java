package test.c_05.passing_this;

class Apple{
	boolean getPeeled(){
		return Peeler.peel(this);
	}
}

class Person{
	public void eat(Apple apple){
		boolean isPeeled=apple.getPeeled();
		if(isPeeled){
			System.out.println("Yummy!");
		}
		else{
			System.out.println("Need to get peeled.");
		}
	}
}

public class PassingThis {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			new Person().eat(new Apple());
		}
	}
}
