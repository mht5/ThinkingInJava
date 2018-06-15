package test.c_12.cleanup;

import test.c_12.input_file.InputFile;

public class Cleanup {
	public static void main(String[] args){
		try{
			InputFile in=new InputFile("Cleanup.java");
			try{
				String s;
				while((s=in.getLine())!=null){
					System.out.println(s);
				}
			}catch(Exception e){
				System.out.println("Caught exception in main");
				e.printStackTrace(System.out);
			}finally{
				in.dispose();
			}
		}catch(Exception e){
			System.out.println("Initialization failed");
			e.printStackTrace(System.out);
		}
	}
}
