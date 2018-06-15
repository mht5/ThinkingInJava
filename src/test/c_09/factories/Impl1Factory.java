package test.c_09.factories;

public class Impl1Factory implements ServiceFactory{

	@Override
	public Service getService() {
		return (new Impl1());
	}
	
}
