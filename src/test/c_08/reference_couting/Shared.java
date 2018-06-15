package test.c_08.reference_couting;

public class Shared {
	private int refCount=0;
	private static long counter;
	private final long id=counter++;
	
	public Shared(){
		System.out.println("Shared("+this+")");
	}
	
	public void addRef(){
		refCount++;
	}
	
	protected void dispose(){
		if(--refCount==0){
			System.out.println("Disposing "+this);
		}
	}
	
	public String toString(){
		return "Shared: "+id;
	}
}
