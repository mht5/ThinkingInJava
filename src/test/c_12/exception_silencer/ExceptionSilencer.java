package test.c_12.exception_silencer;

/**
 * ֱ����finally�з��أ���ʹ�׳����쳣������̨Ҳ���������
 * @author mohan
 *
 */
public class ExceptionSilencer {
	public static void main(String[] args){
		try{
			throw new NullPointerException();
		}/*catch(Exception e){
			e.printStackTrace();
		}*/finally{
			return;
//			System.err.println("over");
		}
	}
}
