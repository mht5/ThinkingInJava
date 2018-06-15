package practice.c_07.p_17;

import practice.c_07.p_17.Animal;

public class Dog extends Animal{
	public void roar(){
		System.out.println("Wurf!");
	}
	
	public void makeSound(Animal a){
		a.roar();
	}
	
	public static void main(String[] args){
		Dog d=new Dog();
		d.makeSound(d);
	}
}
