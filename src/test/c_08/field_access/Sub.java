package test.c_08.field_access;

public class Sub extends Super{
	public int field=2;
	
	public int getField(){
		return field;
	}
	
	public int getSuperField(){
		return super.field;
	}
}
