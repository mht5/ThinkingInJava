package test.c_11.iterable_class;

import java.util.Iterator;

/**
 * 任何实现了Iterable的类都可以使用foreach
 * @author mohan
 *
 */
public class IterableClass implements Iterable<String>{
	protected String[] word=("and that is how we know "+"the earth is banana shaped").split(" ");
	
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			private int index=0;
			
			public boolean hasNext(){
				return index<word.length;
			}
			
			public String next(){
				return word[index++];
			}
			
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args){
		for(String s : new IterableClass()){
			System.out.println(s);
		}
	}
}
