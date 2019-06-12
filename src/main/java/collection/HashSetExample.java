package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		set.add("aaa");
		set.add("bbb");
		set.add(new Integer(9));
		System.out.println("1st : " +set);
		
		HashSet<Object> setCopy = (HashSet<Object>) set.clone();
		
		set.add("Piyush");
		System.out.println("Set Copy" + setCopy);
		/*for(Object obj:set){
			System.out.print(obj + ", ");
		}
		
		for(Object obj:setCopy){
			System.out.print(obj + ", ");
		}*/
		
		Iterator<Object> iterate = set.iterator();
		while(iterate.hasNext()){
			System.out.println(iterate.next());
		}
		
		
		LinkedHashSet<Object> linkedSet = new LinkedHashSet<Object>();
		linkedSet.add("aaa");
		linkedSet.add("bbb");
		linkedSet.add(new Integer(9));
		System.out.println(linkedSet.add(null));
		System.out.println(linkedSet);
		
		/*TreeSet<Object> treeSet = new TreeSet<Object>();
		treeSet.add("aaa");
		treeSet.add("bbb");
	//	treeSet.add(new Integer(9));
	//	System.out.println(treeSet.add(null));
		System.out.println(treeSet);*/
	}

}
