package test.c_11.environment_variables;

import java.util.Map;

/**
 * 通过foreach打印环境变量
 * @author mohan
 *
 */
public class EnvironmentVariables {
	public static void main(String[] args){
		for(Map.Entry entry : System.getenv().entrySet()){
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
