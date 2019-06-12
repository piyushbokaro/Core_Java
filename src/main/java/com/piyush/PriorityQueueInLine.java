package com.piyush;

import java.util.*;
public class PriorityQueueInLine {
	public void takeList(List<? extends String> list) {
		 // insert code here
	}
	public void m1(int a){
		a = a + 1;
	}
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("banana");
		pq.add("pear");
		pq.add("apple");
		pq.add("orange");
		System.out.println(pq);
		System.out.println(pq.poll() + " " + pq.peek());
		System.out.println("\ngjhghghghg");
		HashMap props = new HashMap();
		props.put("key45", "some value");
		props.put("key12", "some other value");
		props.put("key39", "yet another value");
		System.out.println(props);
		Set s = props.keySet();
		s = new TreeSet(s);
		System.out.println(s);
	}
}
