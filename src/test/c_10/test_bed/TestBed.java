package test.c_10.test_bed;

/**
 * TestBed$Tester�����������Եģ�������Ʒʱ����ֱ�Ӱ������ɾ���������޸Ĵ���
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
