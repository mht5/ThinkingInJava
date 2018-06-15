package test.c_07.inherit_constructor_with_params;

public class OnlineGame extends Game{
	public OnlineGame(int i){
		super(i);
		System.out.println("Online game constructor.");
	}
}
