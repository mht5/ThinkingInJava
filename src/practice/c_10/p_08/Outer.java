package practice.c_10.p_08;

/**
 * �ⲿ�಻�ܷ����ڲ���privateԪ��
 * @author mohan
 *
 */
public class Outer {
	private String name="sam";
	
	private void printInfo(){
		System.out.println(name);
	}
	
	private void print(String s){
		System.out.println(s);
	}
	
	class Inner{
		private String innerName="aegon";
		public void change(){
			name="jon";
		}
	}
	
	public static void main(String[] args){
		Outer o=new Outer();
		Inner i=o.new Inner();
		o.printInfo();
		i.change();
		o.printInfo();
//		o.print(innerName);
		o.print(i.innerName);
	}
}
