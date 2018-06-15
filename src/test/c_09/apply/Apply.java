package test.c_09.apply;

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
	
	public static String s="What are you going to do?";
	
	public static void main(String[] args){
		process(new Processor(),s);
		process(new UpperCase(),s);
		process(new LowerCase(),s);
		process(new Splitter(),s);
	}
}
