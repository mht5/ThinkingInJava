package practice.c_18.p_19;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.BinaryFile;

/**
 * 使用BinaryFile类统计文件中不同字节出现的次数
 * @author mohan
 *
 */
public class TestBinaryFile {
	public static void main(String[] args) throws IOException{
	Map<Byte, Integer> m = new HashMap<Byte, Integer>();
	for(Byte bt : BinaryFile.read("do not go gentle into that good night.txt")){
		int frq;
		if(m.get(bt)==null){
			frq=0;
		}
		else{
			frq=m.get(bt);
		}
		m.put(bt,frq+1);
	}
	List<Byte> keys=Arrays.asList(m.keySet().toArray(new Byte[0]));
	Collections.sort(keys);
	for(Byte bt : keys){
		System.out.println(bt+":\t"+m.get(bt));
	}
	}
}
