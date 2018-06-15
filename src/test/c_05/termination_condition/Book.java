package test.c_05.termination_condition;

public class Book {
	boolean checkedOut=false;
	
	Book(boolean checkedOut){
		this.checkedOut=checkedOut;
	}
	
	void checkin(){
		this.checkedOut=false;
	}
	
	protected void finalize(){
		if(checkedOut){
			System.out.println("Error: checked out.");
		}
	}
}
