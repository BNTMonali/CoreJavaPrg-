package genericsPrg;

import java.util.ArrayList;
import java.util.List;

public class GenericsPrg {

	public static void main(String[] args) {
		//parameter rise classes called Generics class or template classes
		// for type safety & avoid type casting use generic
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		System.out.println("Array list with generic :" + al);
		//Polymorphism only for Base type 
		//Collection<String> al1 = new ArrayList<String>();
		List<String> al1 = new ArrayList<String>();
		al1.add("one");
		al1.add("two");
		al1.add("three");
		al1.add("four");
		al1.add("five");
		System.out.println("Array list with generic :" + al);

	}

}
