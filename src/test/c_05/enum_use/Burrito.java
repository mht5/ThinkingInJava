package test.c_05.enum_use;

/**
 * 枚举类型可用于switch
 * @author MOHAN
 *
 */
public class Burrito {
	Spiciness degree;
	
	Burrito(Spiciness degree){
		this.degree=degree;
	}
	
	public void describe(){
		System.out.print("This burrito is ");
		switch(degree){
			case NOT: System.out.println("not spicy at all."); break;
			case MILD:
			case MIDIUM: System.out.println("a little spicy."); break;
			case HOT: System.out.println("quite hot.");break;
			case BURNING: System.out.println("BURNING ME UP, SOME HELP HERE!!!");break;
			default: System.out.println("just another burrito."); break;
		}
	}
	
	public static void main(String[] args){
		Burrito b1=new Burrito(Spiciness.NOT);
		Burrito b2=new Burrito(Spiciness.MIDIUM);
		Burrito b3=new Burrito(Spiciness.HOT);
		Burrito b4=new Burrito(Spiciness.BURNING);
		b1.describe();
		b2.describe();
		b3.describe();
		b4.describe();
	}
}
