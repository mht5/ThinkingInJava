package test.c_10.parcel_test08;

/**
 * �����ڲ���
 * @author mohan
 *
 */
public class Parcel {
	//����һ���̳���(�����ι���������)�����������
	public Wrapping wrapping(int i){
		return new Wrapping(i){
			private int i;
			
			public int value(){
				return super.value();
			}
		};
	}
	
	public static void main(String[] args){
		System.out.println(new Parcel().wrapping(1).value());
	}
}
