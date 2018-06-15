package test.c_09.factories;

public class Impl2Factory implements ServiceFactory{

	@Override
	public Service getService() {
		return (new Impl2());
	}
	
}
