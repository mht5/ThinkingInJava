package practice.c_09.p_18;

public class BicycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return (new Bicycle());
	}
}
