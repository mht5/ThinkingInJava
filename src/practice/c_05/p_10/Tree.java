package practice.c_05.p_10;

public class Tree {
	boolean isPlanted=false;
	
	Tree(){
		
	}
	
	Tree(boolean isPlanted){
		this.isPlanted=isPlanted;
	}
	
	void plant(){
		this.isPlanted=true;
	}
	
	protected void finalize(){
		if(!isPlanted){
			System.out.println("Why don't you plant the tree?");
		}
	}
}
