package practice.c_09.p_14;

public class FourthImpl implements IFourth{

	@Override
	public void print1() {
		System.out.println("print1()");
	}

	@Override
	public void print2() {
		System.out.println("print2()");
	}

	@Override
	public void print3() {
		System.out.println("print3()");
	}

	@Override
	public void print4() {
		System.out.println("print4()");
	}

	@Override
	public String toSring() {
		return getClass().getSimpleName();
	}

}
