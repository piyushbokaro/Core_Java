package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("A");
		System.out.println("Index of Character A ::" + arrayList.indexOf("A"));
		String [] countries = arrayList.toArray(new String[5]);
		System.out.println("ArrayList ::" + arrayList);
		System.out.println("Countries ::" + countries[1]);
		String str1 = "abcdef";
		char[] chars = str1.toCharArray();
		System.out.println(chars[2]);
		Integer a = 1;
		
		System.out.println(a);
		
		Integer b = new Integer(1);
		System.out.println(a.equals(b));
		
		
		String blank = "";
		String comma = ","; 
		System.out.println("Output1: "+blank.split(",").length);
		System.out.println("Output2: "+comma.split(",").length);
		
	}

}
