package practice.c_10.p_07;

public class Outer {
	private String name="sam";
	
	private void print(){
		System.out.println(name);
	}
	
	class Inner{
		public void change(){
			name="jon";
		}
	}
	
	public static void main(String[] args){
		Outer o=new Outer();
		o.print();
		o.new Inner().change();
		o.print();
	}
}
