package practice.c_10.p_16;

public class Tricycle implements Cycle{
	public void ride(){
		System.out.println("Tricycle.ride()");
	}
	
	public static CycleFactory factory=new CycleFactory(){
		public Cycle getCycle(){
			return (new Tricycle());
		}
	};
}
