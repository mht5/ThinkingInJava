package test.c_03.type_casting;

/**
 * 将数值转换为整值
 * @author mohan
 *
 */
public class RoundingNumbers {
	public static void main(String[] args){
		double above=0.7,below=0.4;
		float fAbove=0.7f,fBelow=0.4f;
		System.out.println("Math.round(above): "+Math.round(above));
		System.out.println("Math.round(below): "+Math.round(below));
		System.out.println("Math.round(fAbove): "+Math.round(fAbove));
		System.out.println("Math.round(fBelow): "+Math.round(fBelow));
		System.out.println("Math.floor(above): "+Math.floor(above));
		System.out.println("Math.floor(below): "+Math.floor(below));
		System.out.println("Math.ceil(above): "+Math.ceil(above));
		System.out.println("Math.ceil(below): "+Math.ceil(below));
	}
}
