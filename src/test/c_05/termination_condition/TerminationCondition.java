package test.c_05.termination_condition;

public class TerminationCondition {
	public static void main(String[] args){
		Book b1=new Book(true);
		b1.checkin();
		new Book(true);
		System.gc();
	}
}
