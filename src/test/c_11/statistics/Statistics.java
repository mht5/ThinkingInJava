package test.c_11.statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 使用Map保存每个数字出现的次数
 * @author mohan
 *
 */
public class Statistics {
	public static void main(String[] args){
		Random rand=new Random();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<10000;i++){
			int r=rand.nextInt(43);
			Integer f=map.get(r);
			map.put(r,f==null?1:f+1);
		}
		for(Map.Entry<Integer, Integer> e : map.entrySet()){
			System.out.println(e.getKey()+"="+e.getValue());
		}
	}
}
