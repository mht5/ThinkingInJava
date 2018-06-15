package test.c_03.equivalence;

/**
 * ==��!=�Ƚϵ��¶�������ã���Ȼm��n��ֵ��ͬ������������������ò�����ͬ
 * �Ƚ��������������Ƿ���ͬ������ʹ�����ж���ͨ�õ�equals(equals�����ı���Ϊȷ����������������Ƿ���ͬ���������ڻ�������)
 * ��JDK������һЩ�า����Object���equals()�������ȽϹ���Ϊ������������������һ�£���������һ�£��򷵻�true,��Щ���У�
 *	java.io.file, java.util.Date, java.lang.string, ��װ�ࣨInteger,Double�ȣ�
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
