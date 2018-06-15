package practice.c_10.p_16;

public class Unicycle implements Cycle{
	public void ride(){
		System.out.println("Unicycle.ride()");
	}
	
	public static CycleFactory factory=new CycleFactory(){
		public Cycle getCycle(){
			return (new Unicycle());
		}
	};
}
