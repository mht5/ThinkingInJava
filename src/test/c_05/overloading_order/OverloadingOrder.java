package test.c_05.overloading_order;

public class OverloadingOrder {
	public static void main(String[] args){
		Human sam=new Human("sam");
		sam.eat();
		sam.eat("pancake");
		sam.eat(2, "pancake");
		sam.eat("pancake",2);
	}
}
