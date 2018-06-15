package test.c_10.sequence;

/**
 * �ڲ�����Է�����Χ��������г�Ա
 * @author mohan
 *
 */
public class Sequence {
	private static Object[] items;
	private int next=0;
	
	public Sequence(int size){
		items=new Object[size];
	}
	
	public void add(Object x){
		if(next<items.length){
			items[next++]=x;
		}
	}
	
	private static class SequenceSelector implements Selector{
		private int i=0;
		
		@Override
		public boolean end() {
			//������Χ�����private�ֶ�
			return (i==items.length);
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i<items.length){
				i++;
			}
		}
	}
	
	public static Selector selector(){
		return (new SequenceSelector());
	}
	
	public static void main(String[] args){
		Sequence sequence=new Sequence(10);
		for(int i=0;i<10;i++){
			sequence.add(Integer.toString(i));
		}
		Selector selector=Sequence.selector();
		while(!selector.end()){
			System.out.print(selector.current()+" ");
			selector.next();
		}
	}
}
