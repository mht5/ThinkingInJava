package test.c_18.person;

import java.io.IOException;
import java.util.ArrayList;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/**
 * ��XML�лָ�����
 * @author mohan
 *
 */
public class People extends ArrayList<Person>{
	public People(String fileName) throws ValidityException, ParsingException, IOException{
		Document doc=new Builder().build(fileName);
		Elements elements=doc.getRootElement().getChildElements();
		for(int i=0; i<elements.size(); i++){
			add(new Person(elements.get(i)));
		}
	}
	
	public static void main(String[] args) throws ValidityException, ParsingException, IOException{
		People p=new People("people.xml");
		System.out.println(p);
	}
}
