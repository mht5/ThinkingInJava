package practice.c_05.p_12;

public class Tank {
	boolean isFull;
	
	Tank(){
		
	}
	
	Tank(boolean isFull){
		this.isFull=isFull;
	}
	
	void fullTank(){
		this.isFull=true;
	}
	
	void emptyTank(){
		this.isFull=false;
	}
	
	protected void finalize(){
		if(!isFull){
			System.out.println("You need to empty the tank before cleaning.");
		}
	}
}
