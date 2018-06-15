package test.c_08.transmogrify;

/**
 * 用继承表达行为间的差异，并用字段表达状态上的变化
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
