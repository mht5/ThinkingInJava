package practice.c_06.p_08;

public class Connection {
	private Connection(){
		System.out.println("Connection contructor.");
	}
	
	protected static Connection makeConnection(){
		System.out.println("making connection...");
		return new Connection();
	}
}
