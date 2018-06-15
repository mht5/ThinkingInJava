package test.c_03.equivalence;

/**
 * ==和!=比较的事对象的引用，虽然m和n的值相同，但是两个对象的引用并不相同
 * 比较两个对象内容是否相同，可以使用所有对象通用的equals(equals方法的本意为确定两个对象的引用是否相同，不能用于基本类型)
 * 而JDK类中有一些类覆盖了Object类的equals()方法，比较规则为：如果两个对象的类型一致，并且内容一致，则返回true,这些类有：
 *	java.io.file, java.util.Date, java.lang.string, 包装类（Integer,Double等）
 * @author mohan
 *
 */
public class Equivalence {
	public static void main(String[] args){
		System.out.println("Object:");
		Integer m=new Integer(47);
		Integer n=new Integer(47);
		System.out.println(m==n);
		System.out.println(m!=n);

		System.out.println("\nVariable:");
		Integer i=12;
		Integer j=12;
		System.out.println(i==j);
		System.out.println(i!=j);

		System.out.println("\nEqual Method:");
		System.out.println(m.equals(n));
		
		double d1=12;
		double d2=12;
		System.out.println("\n"+(d1==d2));
		System.out.println(d1!=d2);
//		System.out.println(d1.equals(d2));
		
		Double num1=new Double(12);
		Double num2=new Double(12);
		System.out.println("\n"+(num1==num2));
		System.out.println(num1!=num2);
		System.out.println(num1.equals(num2));
	}
}
