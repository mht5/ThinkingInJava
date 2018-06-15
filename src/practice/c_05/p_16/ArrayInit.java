package practice.c_05.p_16;

public class ArrayInit {
	public static void main(String[] args){
		String[] a=new String[6];
		String s;
		for(int i=0;i<a.length;i++){
			s=i+"*"+(i*i)+"="+(i*(i*i));
			a[i]=s;
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
