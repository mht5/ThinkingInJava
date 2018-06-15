package practice.c_06.p_08;

public class ConnectionManager {
	static int num=6;
	static Connection[] ca=new Connection[num];
	
	public static void makeConnection(){
		for(Connection c : ca){
			c=Connection.makeConnection();
		}
	}
	
	public static void main(String[] args){
		makeConnection();
	}
}
