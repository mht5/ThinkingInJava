package practice.c_05.p_22;

public class Money{
	Currency currency;
	
	Money(Currency currency){
		this.currency=currency;
	}
	
	void printInfo(){
		System.out.print("This is worth ");
		switch(currency){
		case ONE: System.out.println("1 Yuan."); break;
		case FIVE: System.out.println("5 Yuan."); break;
		case TEN: System.out.println("10 Yuan."); break;
		case TWENTY: System.out.println("20 Yuan."); break;
		case FIFTY: System.out.println("50 Yuan."); break;
		case HUNDRED: System.out.println("100 Yuan."); break;
		default: System.out.println("no money."); break;
		}
	}
	
	public static void main(String[] args){
		Money m1=new Money(Currency.ONE);
		Money m2=new Money(Currency.FIVE);
		Money m3=new Money(Currency.TEN);
		Money m4=new Money(Currency.TWENTY);
		Money m5=new Money(Currency.FIFTY);
		Money m6=new Money(Currency.HUNDRED);
		m1.printInfo();
		m2.printInfo();
		m3.printInfo();
		m4.printInfo();
		m5.printInfo();
		m6.printInfo();
	}
}
