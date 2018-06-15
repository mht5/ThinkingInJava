package practice.c_18.p_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ReadFile {
	public static List<String> read(String filename) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		List<String> list=new LinkedList<String>();
		while((s=in.readLine())!=null){
			list.add(s);
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException{
		List<String> list=read("�ⶼ����ׯ.txt");
		for(int i=list.size()-1; i>=0; i--){
			System.out.println(list.get(i));
		}
	}
}
