package test.c_07.blank_final;

public class BlankFinal {
	private final int i=0;
	private final int j;
	private final Poppet p;
	
	public BlankFinal(){
		j=1;
		p=new Poppet(1);
	}
	
	public BlankFinal(int x){
		j=x;
		p=new Poppet(x);
	}
	
	public static void main(String[] args){
		new BlankFinal();
		new BlankFinal(23);
	}
}
