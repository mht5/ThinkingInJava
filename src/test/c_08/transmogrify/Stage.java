package test.c_08.transmogrify;

/**
 * �ü̳б����Ϊ��Ĳ��죬�����ֶα��״̬�ϵı仯
 * @author mohan
 *
 */
public class Stage {
	private Actor actor=new HappyActor();
	
	public void change(){
		actor=new SadActor();
	}
	
	public void perform(){
		actor.act();
	}
	
	public static void main(String[] args){
		Stage stage=new Stage();
		stage.perform();
		stage.change();
		stage.perform();
	}
}
