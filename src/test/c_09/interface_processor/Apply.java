package test.c_09.interface_processor;

/**
 * �������ģʽ���ܹ����������ݵĲ�������ͬ�����в�ͬ��Ϊ�ķ���
 * ���෽��������Ҫִ�е��㷨�в���ĳɷ֣�"����"�����仯�Ĳ���
 * ���Ծ��Ǵ���ȥ�Ķ��������������Ҫִ�еĴ���
 * @author mohan
 *
 */
public class Apply {
	public static void process(Processor p, Object o){
		System.out.println("Using processor "+p);
		System.out.println(p.process(o));
	}
}
