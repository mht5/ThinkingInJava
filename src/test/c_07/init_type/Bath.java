package test.c_07.init_type;

/**
 * 四种初始化方式
 * @author mohan
 *
 */
public class Bath {
	//定义时初始化
	private String 
		s1="happy",
		s2="happy",
		s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	
	public Bath(){
		System.out.println("Inside bath");
		//构造器中初始化
		s3="joy";
		toy=3.14f;
		castille=new Soap();
	}
	
	{
		i=47;
	}
	
	public String toString(){
		//使用前初始化 | 惰性初始化
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
		//实例初始化
		Bath bath=new Bath();
		System.out.println(bath);
	}
}
