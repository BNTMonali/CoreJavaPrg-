package assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListPrg {

	public static void main(String[] args) {

		// 10,9,8,1,3,5,7,10,9,8,7,6,5,4,3,2,1
		// 10,9,8,1,3,5,7,6,4,2
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(9);
		al.add(8);
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(10);
		al.add(9);
		al.add(8);
		al.add(7);
		al.add(6);
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);

		System.out.println(al);
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(al);
		System.out.println(s);

		TreeSet<Integer> t = new TreeSet<Integer>(s);
		System.out.println(t);

		TreeSet<Integer> t2 = new TreeSet<Integer>(new Mycompa());
		t2.addAll(t);
		System.out.println(t2);
	}
}

class Mycompa implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return -i1.compareTo(i2);
	}

}
