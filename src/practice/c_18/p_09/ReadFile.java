package practice.c_18.p_09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
	public static List<String> read(String filename) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		List<String> list=new LinkedList<String>();
		while((s=in.readLine())!=null){
			list.add(s.toUpperCase());
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader strIn=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input the filename: ");
		String s=strIn.readLine();
		List<String> list=read(s);
		System.out.println("The content of \""+s+"\" is as below(in reverse order): ");
		for(int i=list.size()-1; i>=0; i--){
			System.out.println(list.get(i));
		}
	}
}
