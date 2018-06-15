package practice.c_18.p_31;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.Serializer;
import nu.xom.ValidityException;

class Person{
	private String first, last, address, city;
	private int zipCode;
	
	public Person(String first, String last, String address, String city, int zipCode){
		this.first=first;
		this.last=last;
		this.address=address;
		this.city=city;
		this.zipCode=zipCode;
	}
	
	public Element getXml(){
		Element person=new Element("person");
		Element firstName=new Element("first");
		firstName.appendChild(first);
		Element lastName=new Element("last");
		lastName.appendChild(last);
		Element addr=new Element("address");
		addr.appendChild(address);
		Element cty=new Element("city");
		cty.appendChild(city);
		Element zip=new Element("zip");
		zip.appendChild(Integer.toString(zipCode));
		person.appendChild(firstName);
		person.appendChild(lastName);
		person.appendChild(addr);
		person.appendChild(cty);
		person.appendChild(zip);
		return person;
	}
	
	public Person(Element person){
		first=person.getFirstChildElement("first").getValue();
		last=person.getFirstChildElement("last").getValue();
		address=person.getFirstChildElement("address").getValue();
		city=person.getFirstChildElement("city").getValue();
		zipCode=Integer.valueOf(person.getFirstChildElement("zip").getValue());
	}
	
	public String toString(){
		return first+" "+last+" "+address+" "+city+" "+zipCode;
	}
	
	public static void format(OutputStream os, Document doc) throws Exception{
		Serializer serializer=new Serializer(os, "ISO-8859-1");
		serializer.setIndent(4);
		serializer.setMaxLength(60);
		serializer.write(doc);
		serializer.flush();
	}
}

class People extends ArrayList<Person>{
	public People(String fileName) throws ValidityException, ParsingException, IOException{
		Document doc=new Builder().build(fileName);
		Elements elements=doc.getRootElement().getChildElements();
		for(int i=0; i<elements.size(); i++){
			add(new Person(elements.get(i)));
		}
	}
}

public class PeopleWithMoreInfo{
	public static void main(String[] args) throws Exception{
		List<Person> people=Arrays.asList(
				new Person("sam", "the slayer", "room 1", "The Wall", 123456),
				new Person("jon", "the nothing knower", "room 2", "The Wall", 123456),
				new Person("brandon", "the builder", "house 1", "Winterfell", 123456));
		System.out.println(people);
		Element root=new Element("people");
		for(Person p : people){
			root.appendChild(p.getXml());
		}
		Document doc=new Document(root);
		Person.format(System.out, doc);
		Person.format(new BufferedOutputStream(new FileOutputStream("people.xml")),doc);
		People p=new People("people.xml");
		System.out.println(p);
	}
}
