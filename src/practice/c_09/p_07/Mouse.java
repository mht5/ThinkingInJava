package practice.c_09.p_07;

public class Mouse implements Rodent{
	public void what(){
		System.out.println(this.toString());
	}
	
	public String toString(){
		return"a mouse.";
	}
}
