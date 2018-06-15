package test.c_12.exception_silencer;

/**
 * 直接在finally中返回，即使抛出了异常，控制台也不会有输出
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
