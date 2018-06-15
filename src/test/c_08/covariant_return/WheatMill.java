package test.c_08.covariant_return;

public class WheatMill extends Mill{
	public Wheat process(){
		return new Wheat();
	}
}
