package test.c_07.init_type;

/**
 * ���ֳ�ʼ����ʽ
 * @author mohan
 *
 */
public class Bath {
	//����ʱ��ʼ��
	private String 
		s1="happy",
		s2="happy",
		s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	
	public Bath(){
		System.out.println("Inside bath");
		//�������г�ʼ��
		s3="joy";
		toy=3.14f;
		castille=new Soap();
	}
	
	{
		i=47;
	}
	
	public String toString(){
		//ʹ��ǰ��ʼ�� | ���Գ�ʼ��
		if(s4==null){
			s4="joy";
		}
		return
			"s1="+s1+"\n"+
			"s2="+s2+"\n"+
			"s3="+s3+"\n"+
			"s4="+s4+"\n"+
			"i="+i+"\n"+
			"toy="+toy+"\n"+
			"castille="+castille+"\n";
	}
	
	public static void main(String[] args){
		//ʵ����ʼ��
		Bath bath=new Bath();
		System.out.println(bath);
	}
}
