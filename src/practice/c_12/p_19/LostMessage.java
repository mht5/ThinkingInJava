package practice.c_12.p_19;

/**
 * �쳣��ʧ��ǰһ���׳����쳣��δ��������׳�����һ���쳣������ǰ���׳����쳣������
 * @author mohan
 *
 */

class Exception1 extends Exception{
	public String toString(){
		return "a very important exception";
	}
}

class Exception2 extends Exception{
	public String toString(){
		return "a trivial exception";
	}
}

public class LostMessage {
	public void f() throws Exception1{
		throw new Exception1();
	}
	
	public void dispose() throws Exception2{
		throw new Exception2();
	}
	
	public static void main(String[] args){
		try{
			LostMessage lm=new LostMessage();
			try{
				lm.f();
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				lm.dispose();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
