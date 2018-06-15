package practice.c_10.p_16;

public class Bicycle implements Cycle{
	public void ride(){
		System.out.println("Bicycle.ride()");
	}
	
	public static CycleFactory factory=new CycleFactory(){
		public Cycle getCycle(){
			return (new Bicycle());
		}
	};
}
