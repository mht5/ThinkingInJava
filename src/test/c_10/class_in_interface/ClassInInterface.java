package test.c_10.class_in_interface;

/**
 * �ӿ��ڲ�Ƕ����ʵ�ָýӿ�
 * �����Ҫ�������õĴ��룬ʹ���ǿ��Ա��ӿڵĵĲ�ͬʵ�ֹ��ã�����ʹ�ýӿ�Ƕ����
 * @author mohan
 *
 */
public interface ClassInInterface {
	public void howdy();
	
	public static class Test implements ClassInInterface{
		public void howdy(){
			System.out.println("Howdy!");
		}
		
		public static void main(String[] args){
			new Test().howdy();
		}
	}
}
