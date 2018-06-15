package practice.c_09.p_07;

public class Tester {
	public static void what(Rodent[] r){
		for(Rodent rod : r){
			rod.what();
		}
	}
	public static void main(String[] args){
		Rodent[] r=new Rodent[]{new Mouse(),new Gerbil(),new Hamster()};
		what(r);
	}
}
