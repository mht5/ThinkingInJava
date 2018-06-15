package practice.c_18.p_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
	public static List<String> read(String filename, String word) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		List<String> list=new LinkedList<String>();
		while((s=in.readLine())!=null){
			if(s.contains(word)){
				list.add(s);
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader strIn=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input the filename: ");
		String s1=strIn.readLine();
		System.out.println("Input the word you are trying to find: ");
		String s2=strIn.readLine();
		List<String> list=read(s1, s2);
		System.out.println("The content of \""+s1+"\" which contains \""+s2+"\" is as below(in reverse order): ");
		for(int i=list.size()-1; i>=0; i--){
			System.out.println(list.get(i));
		}
	}
}
