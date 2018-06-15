package test.c_02.show_properties;
/**
 * show environment properties by using System.class
 * @author MOHAN
 *
 */
public class ShowProperties {
	public static void main(String[] args){
		System.getProperties().list(System.out);
		System.out.println("\nusername: "+System.getProperty("user.name"));
		System.out.println("language: "+System.getProperty("user.language"));
		System.out.println("Java path: "+System.getProperty("java.library.path"));
	}
}
