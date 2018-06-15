package practice.c_11.p_27;

public class Command {
	private String command;
	
	public Command(String s){
		this.command=s;
	}
	
	public void operation(){
		System.out.println(command);
	}
}
