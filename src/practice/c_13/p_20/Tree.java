package practice.c_13.p_20;

import java.util.Scanner;

/**
 * Ê¹ÓÃScannerÉ¨Ãè×Ö·û´®
 * @author mohan
 *
 */
public class Tree {
	private int age;
	private double height;
	private float weight;
	private long leaves;
	private String name;
	
	public Tree(String s){
		Scanner stdin=new Scanner(s);
		this.age=stdin.nextInt();
		this.height=stdin.nextDouble();
		this.weight=stdin.nextFloat();
		this.leaves=stdin.nextLong();
		this.name=stdin.nextLine();
	}
	
	public String toString(){
		return "This tree is "+age+" years old, "+height+" meters high and weighs "+weight+" kgs. It has "+leaves+" leaves and it's named \""+name+"\".";
	}
	
	public static void main(String[] args){
		String s="12 12.02 200.20 1000000 THE TREE";
		System.out.println(new Tree(s));
	}
}
