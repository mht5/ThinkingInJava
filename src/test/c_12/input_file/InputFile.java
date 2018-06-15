package test.c_12.input_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
	private BufferedReader in;
	
	public InputFile(String filename) throws Exception{
		try{
			BufferedReader in=new BufferedReader(new FileReader(filename));
		}catch(FileNotFoundException e){
			System.out.println("Can not find file: "+filename);
			throw e;
		}catch(Exception e){
			try{
				in.close();
			}catch(Exception e1){
				System.out.println("in.close() was unsuccessful");
			}
			throw e;
		}finally{
			
		}
	}
	
	public String getLine(){
		String s;
		try{
			s=in.readLine();
		}catch(IOException e){
			throw new RuntimeException("readLine failed");
		}
		return s;
	}
	
	public void dispose(){
		try{
			in.close();
			System.out.println("dispose() successful");
		}catch(Exception e){
			throw new RuntimeException("in.close() failed");
		}
	}
}
