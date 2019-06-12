package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println(list);
		
		System.out.println("Using for each");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("Using Iterator");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println("Using ListIterator");
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());
		}
	}

}
