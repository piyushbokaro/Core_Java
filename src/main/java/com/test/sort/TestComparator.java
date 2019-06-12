package com.test.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestComparator {
	public static void main(String args[]) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(101, "Zues", 26));
		arraylist.add(new Student(505, "Abey", 24));
		arraylist.add(new Student(809, "Vignesh", 32));

		// Sorting based on Student Name 
		System.out.println("Student Name Sorting:");
		Collections.sort(arraylist, Student.StuNameComparator);

		for (Student str : arraylist) {
			System.out.println(str.getStudentname());
		}

		// Sorting on Rollno property 
		System.out.println("RollNum Sorting:");
		Collections.sort(arraylist, Student.StuRollno);
		for (Student str : arraylist) {
			System.out.println(str.getRollno());
		}
		
/*		Set<Student> set =new HashSet<Student>();
		set.add(new Student(101, "Zues", 26));j
		set.add(new Student(505, "Abey", 24));
		set.add(new Student(809, "Vignesh", 32));
		set.add(new Student(809, "Vignesh", 32));*/
		
		
		Map<Student,String> map=new ConcurrentHashMap<Student,String>();
		Student s1=new Student(101, "Zues", 21);
		Student s2=new Student(102, "Zues", 22);
		Student s3=new Student(103, "Zues", 34);
		Student s4=new Student(103, "Zues1", 43);
		Student s5=new Student(1034, "Zues", 47);
		 map.put(s1,"3");
		 map.put(s2,"4");
		// map.put(s3,null);
		 map.put(s4,"333");
		for(Entry<Student,String> entry : map.entrySet()){
			System.out.println("Value-->"+entry.getValue());
			map.put(s5,"11111111111");
			
		}
		
		for(Entry<Student,String> entry : map.entrySet()){
			System.out.println("Value-->"+entry.getValue());
			map.put(s5,"11111111111");
			
		}
		
	}
}
