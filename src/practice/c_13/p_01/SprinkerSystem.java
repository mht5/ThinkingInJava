package practice.c_13.p_01;

/**
 * ÿһ���ǻ�����Ķ�����һ��toString()����������������Ҫһ��String����ֻ��һ������ʱ���÷����ͻᱻ����
 * @author mohan
 *
 */
public class SprinkerSystem {
	private String valve1,valve2,valve3,valve4;
	private static WaterSource source=new WaterSource();
	private int i;
	private float f;
	public String toString1(){
		long before=System.currentTimeMillis();
		String s=
				"valve1="+valve1+" "+
				"valve2="+valve2+" "+
				"valve3="+valve3+" "+
				"valve4="+valve4+"\n"+
				"i="+i+" f="+f+" source="+source;
		long after=System.currentTimeMillis();
		System.out.println("using string: "+(after-before)+"ms");
		return s;
	}

	public String toString2(){
		long before=System.currentTimeMillis();
		StringBuilder s=new StringBuilder();
		s.append("valve1=").append(valve1).append(" valve2=").append(valve2)
			.append(" valve3=").append(valve3).append(" valve4=").append(valve4)
			.append(" i=").append(i).append(" f").append(f)
			.append(" source").append(source);
		long after=System.currentTimeMillis();
		System.out.println("using stringBuilder: "+(after-before)+"ms");
		return s.toString();
	}
	
	public static void main(String[] args){
		SprinkerSystem sprinkers=new SprinkerSystem();
		sprinkers.toString1();
		sprinkers.toString2();
	}
}
