package test.c_11.stack;

public class Tester {
	public static void main(String[] args){
		Stack<String> stack=new Stack<String>();
		for(String s : "What is going to happen".split(" ")){
			stack.push(s);
		}
		System.out.println(stack.toString());
		while(!stack.empty()){
			System.out.print(stack.pop()+" ");
		}
	}
}
