package test.c_11.test_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * add到List尾部：ArrayList和LinkedList需要的时间都是常数时间，ArrayList更快
 * add到List头部：ArrayList会将所有元素后移，时间复杂度为O(n)；LinkedList有addFirst()，所需时间是常数时间。LinkedList更快
 * add到List中间：ArrayList更快
 * @author mohan
 *
 */
public class TestList {
	public static void main(String[] args) {
    testAddFirst();
    testAddMiddle();
    testAdd();
  }

  //数量级别为10w
  public static int DEFAULTLEVEL=100000;
  
  public static void testAddFirst() {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();
    
    //arrayList
    long before = System.currentTimeMillis();
    for(int i = 0 ; i < DEFAULTLEVEL ; i++ ) {
      arrayList.add(0,i);
    }
    long after = System.currentTimeMillis();
    System.out.println("arrayList插入0位置耗时:" + (after - before));
    
    //linkedList
    before = System.currentTimeMillis();
    for(int i = 0 ; i < DEFAULTLEVEL ; i ++) {
      linkedList.add(0,i);
    }
    after = System.currentTimeMillis();
    System.out.println("linkedList插入0位置耗时:" + (after - before));
    
    //linkedList addFirst()
    LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
    before = System.currentTimeMillis();
    for(int i = 0 ; i < DEFAULTLEVEL ; i++) {
      linkedList2.addFirst(i);
    }
    after = System.currentTimeMillis();
    System.out.println("linked addFirst()耗时:" + (after - before));
    
  }
  
  public static void testAddMiddle() {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();
    
    	//arrayList
        long before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i++ ) {
          arrayList.add(arrayList.size()/2,i);
        }
        long after = System.currentTimeMillis();
        System.out.println("arrayList插入中间位置耗时:" + (after - before));
        
        //linkedList
        before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i ++) {
          linkedList.add(linkedList.size()/2,i);
        }
        after = System.currentTimeMillis();
        System.out.println("linkedList插入中间位置耗时:" + (after - before));
  }
  
  public static void testAdd() {
    List<Integer> arrayList = new ArrayList<Integer>();
    List<Integer> linkedList = new LinkedList<Integer>();
    
		//arrayList
        long before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i++ ) {
          arrayList.add(i);
        }
        long after = System.currentTimeMillis();
        System.out.println("arrayList插入尾部耗时:" + (after - before));
        
        //linkedList
        before = System.currentTimeMillis();
        for(int i = 0 ; i < DEFAULTLEVEL ; i ++) {
          linkedList.add(i);
        }
        after = System.currentTimeMillis();
        System.out.println("linkedList插入尾部耗时:" + (after - before));
  }
  
}