package test.c_03.UR_shift;

/**
 * λ����
 * ���Ʋ�����(<<)�ܰ��ղ������Ҳ�ָ����λ������������ߵĲ����������ƶ�����λ��0��
 * "�з���"���Ʋ�����(>>)���ղ������Ҳ�ָ����λ������������ߵĲ����������ƶ���ʹ�á�������չ����������Ϊ�������ڸ�λ����0����������1
 * "�޷���"���Ʋ�����(>>>)ʹ�á�����չ�����������������ڸ�λ����0
 * �ڽ��С��޷��š�����λ��ϸ�ֵ����ʱ�����ܻ�����һ�����⣺
 * �����byte��shortֵ������������λ���㣬�õ��Ŀ��ܲ�����ȷ�Ľ����
 * �������Ȼᱻת����int���ͣ��ٽ������Ʋ�����Ȼ�󱻽ضϣ���ֵ��ԭ�������ͣ�����������¿��ܵõ�-1�Ľ��
 * @author mohan
 *
 */
public class URShift {
	public static void main(String[] args){
		int i=-1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		long l=-1;
		System.out.println(Long.toBinaryString(l));
		l>>>=10;
		System.out.println(Long.toBinaryString(l));
		short s=-1;
		System.out.println(Integer.toBinaryString(s));
//		����ʹ���˸�ֵ����
		s>>>=10;
		System.out.println(Integer.toBinaryString(s));
		s=-1;
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(s>>>10));
		byte b=-1;
		System.out.println(Integer.toBinaryString(b));
//		����Ҳ�����˸�ֵ����
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		b=-1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b>>>10));
	}
}
