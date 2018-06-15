package test.c_10.test_bed;

/**
 * TestBed$Tester类是用来测试的，发布产品时可以直接把这个类删除而不用修改代码
 * @author mohan
 *
 */
public class TestBed {
	public void test(){
		System.out.println("test()");
	}
	
	public static class Tester{
		public static void main(String[] args){
			new TestBed().test();
		}
	}
}
