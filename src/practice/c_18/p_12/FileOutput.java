package practice.c_18.p_12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import practice.c_18.p_08.ReadFile;
import test.c_18.buffered_input_file.BufferedInputFile;


public class FileOutput {
	public static void main(String[] args) throws IOException{
		String file="FileOutput.txt";
		List<String> list=ReadFile.read("题都城南庄.txt");
		PrintWriter out=new PrintWriter(file);
		int line=1;
		/*for(ListIterator<String> it=list.listIterator(); it.hasNext(); line++){
			out.println(line+": "+it.next());
		}*/
		for(int i=0;i<list.size();i++,line++){
			out.println(line+": "+list.get(i));
		}
		out.close();
		System.out.println(BufferedInputFile.read(file));
	}
}
