package practice.c_18.p_17;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.TextFile;

/**
 * 使用util.TextFile类统计文件中每个字符出现的次数
 * @author mohan
 *
 */
public class TestTextFile {
	public static void main(String[] args){
		TextFile file=new TextFile("do not go gentle into that good night.txt", "\\W");
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(String word: file){
			for(int i=0;i<word.length();i++){
				char c=word.charAt(i);
				int frq;
				if(m.get(c)==null){
					frq=0;
				}
				else{
					frq=m.get(c);
				}
				m.put(c,frq+1);
			}
		}
		List<Character> keys=Arrays.asList(m.keySet().toArray(new Character[0]));
		Collections.sort(keys);
		for(Character c : keys){
			System.out.println(c+":\t"+m.get(c));
		}
	}
}
