package practice.c_06.p_01.part1;

public class Tree {
	private double height;
	private int year;
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printInfo(){
		System.out.println("This tree is "+height+" meters tall and "+year+" years old.");
	}
}
