package practice.c_10.p_21;

public interface Base {
	public void print();
	
	public static class Tester{
		public static void print(Base b){
			b.print();
		}
	}
}
