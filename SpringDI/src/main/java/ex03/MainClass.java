package ex03;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("collection-context.xml");
		
		Customer customer = ctx.getBean("customer", Customer.class);
		
		Map<String, Object> maps = customer.getMaps();
		System.out.println(maps.toString());
		List<String> list = customer.getLists();
		System.out.println(list.toString());
		List<Person> list2 = customer.getPersons();
		System.out.println(list2.toString());
		
	}
	
}
