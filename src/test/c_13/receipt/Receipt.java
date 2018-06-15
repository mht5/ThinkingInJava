package test.c_13.receipt;

import java.util.Formatter;

public class Receipt {
	private double total=0;
	private Formatter out=new Formatter(System.out);
	private int x=15,y=5,z=10;
	private String f1="%-15s %5s %10s\n";
	private String f2="%-15s %5d %10.2f\n";
	private String f3="%-15s %5s %10.2f\n";
	
	public void printTitle(){
		out.format(f1, "Items","Qty","Price");
		out.format(f1, "-------","---","-------");
	}
	
	public void print(String name, int qty, double price){
		out.format(f2, name,qty,price);
		total+=price*qty;
	}
	
	public void printTotal(){
		out.format(f2, "Tax",2,total*0.6);
		out.format(f1,"","","------");
		out.format(f3, "Total","",total*1.06);
	}
	
	public static void main(String[] args){
		Receipt receipt=new Receipt();
		receipt.printTitle();
		receipt.print("item1", 1, 2);
		receipt.print("item2", 4, 2.4);
		receipt.print("item3", 2, 2);
		receipt.print("item4", 1, 2.4);
		receipt.print("item5", 3, 2);
		receipt.print("item6", 2, 2.4);
		receipt.printTotal();
	}
}
