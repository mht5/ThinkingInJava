package test.c_07.plate_setting;

public class PlateSetting extends Custom{
	public PlateSetting(int i){
		super(i);
		new Spoon(i);
		new Fork(i);
		new Knife(i);
		new DinnerPlate(i);
		System.out.println("Plate setting constructor.");
	}
	
	public static void main(String[] args){
		new PlateSetting(1);
	}
}
