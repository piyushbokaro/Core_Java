package com.piyush;

import java.util.HashSet;
import java.util.Set;

class Person{
	String name = "No Name";
	public Person(){
		
	}
	public Person(String nm){
		name = nm;
	}
}
class Employee extends Person{
	String empId = "0000";
	public Employee(String id){
		empId = id;
	}
}
public class EmployeeTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		 Integer i1 = 45;
		 Integer i2 = 46;
		 set.add(i1);
		 set.add(i1);
		 set.add(i2); 
		 System.out.print(set.size() + " ");
		 set.remove(i1); 
		 System.out.print(set.size() + " ");
		 i2 = 47;
		 set.remove(i2); 
		 System.out.print(set.size() + " ");
		 
		 Float pi = new Float(3.14f);
		  if (pi > 3) {
		  System.out.print("pi is bigger than 3. ");
		  }
		  else {
		  System.out.print("pi is not bigger than 3. ");
		  }
	}
}
