package test.c_07.to_string;

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
	public String toString(){
		return 
				"valve1="+valve1+" "+
				"valve2="+valve2+" "+
				"valve3="+valve3+" "+
				"valve4="+valve4+"\n"+
				"i="+i+" f="+f+" source="+source;
	}
	
	public static void main(String[] args){
		SprinkerSystem sprinkers=new SprinkerSystem();
		System.out.println(sprinkers);
	}
}
