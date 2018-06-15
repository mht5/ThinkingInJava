package practice.c_11.p_15;

import test.c_11.stack.Stack;

public class TestStack {
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
		String[] s="+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---".split("");
		for(int i=0;i<s.length;i++){
			if(s[i].equals("+")){
				stack.push(s[++i]);
			}
			else if(s[i].equals("-")){
				System.out.print(stack.pop());
			}
		}
	}
}
