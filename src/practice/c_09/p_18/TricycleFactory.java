package practice.c_09.p_18;

public class TricycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return (new Tricycle());
	}
}
