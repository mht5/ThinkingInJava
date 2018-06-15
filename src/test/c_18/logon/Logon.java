package test.c_18.logon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 使用transient修饰的变量不会被自动序列化
 * @author mohan
 *
 */
public class Logon implements Serializable{
	private Date date=new Date();
	private String username;
	private transient String password;
	
	public Logon(String name, String pwd){
		username=name;
		password=pwd;
	}
	
	public String toString(){
		return "logon info:\nusername: "+username+"\ndate: "+date+"\npassword: "+password;
	}
	
	public static void main(String[] args) throws Exception{
		Logon a=new Logon("sam","the slayer");
		System.out.println("a="+a);
		
		ObjectOutputStream out=new ObjectOutputStream(
				new FileOutputStream("logon.out"));
		out.writeObject(a);
		out.close();
		
		TimeUnit.SECONDS.sleep(1);
		
		ObjectInputStream in=new ObjectInputStream(
				new FileInputStream("logon.out"));
		System.out.println("Recovering data at "+new Date());
		a=(Logon)in.readObject();
		System.out.println(a);
	}
}
