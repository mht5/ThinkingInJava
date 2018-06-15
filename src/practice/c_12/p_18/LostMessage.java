package practice.c_12.p_18;

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

class Exception3 extends Exception{
	public String toString(){
		return "a big problem";
	}
}

public class LostMessage {
	public void f() throws Exception1{
		throw new Exception1();
	}
	
	public void dispose() throws Exception2{
		throw new Exception2();
	}
	
	public void g() throws Exception3{
		throw new Exception3();
	}
	
	public static void main(String[] args){
		try{
			LostMessage lm=new LostMessage();
			try{
				lm.f();
			}catch(Exception e){
				lm.dispose();
			}finally{
				lm.g();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
