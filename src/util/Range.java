package util;

public class Range {
	public static int[] range(int n){
		int[] result=new int[n];
		for(int i=0;i<n;i++){
			result[i]=i;
		}
		return result;
	}
	
	public static int[] range(int begin, int end){
		int n=end-begin;
		int[] result=new int[n];
		for(int i=0;i<n;i++){
			result[i]=begin+i;
		}
		return result;
	}
	
	public static int[] range(int begin, int end, int step){
		int n=(end-begin)/step;
		int[] result=new int[n];
		for(int i=0;i<n;i++){
			result[i]=begin+(i*step);
		}
		return result;
	}
}
