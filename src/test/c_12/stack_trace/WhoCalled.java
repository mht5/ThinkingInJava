package test.c_12.stack_trace;

public class WhoCalled {
	public static void f() throws Exception{
		try{
			throw new Exception();
		}catch(Exception e){
			for(StackTraceElement ste : e.getStackTrace()){
				System.out.println(ste.getMethodName());
			}
		}
	}
	
	public static void g() throws Exception{
		f();
	}
	
	public static void h() throws Exception{
		g();
	}
	
	public static void main(String[] args) throws Exception{
		f();
		System.out.println("----------------------------------");
		g();
		System.out.println("----------------------------------");
		h();
	}
}
