package test.c_11.environment_variables;

import java.util.Map;

/**
 * ͨ��foreach��ӡ��������
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
