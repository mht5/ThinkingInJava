package test.c_08.reference_couting;

public class ReferenceCouting {
	public static void main(String[] args){
		Shared shared=new Shared();
		Composing[] composing={new Composing(shared),new Composing(shared),new Composing(shared)};
		for(Composing c : composing){
			c.dispose();
		}
	}
}
