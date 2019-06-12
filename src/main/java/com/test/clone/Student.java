package com.test.clone;

public class Student implements Cloneable {
	  //Contained object
	  private Subject subj;

	  private String name;

	  public Subject getSubj() {
		return subj;
	  }

	  public String getName() {
		return name;
	  }

	  public void setName(String s) {
		name = s;
	  }

	  public Student(String s, String sub) {
		name = s;
		subj = new Subject(sub);
	  }

	  public Object clone() {
		
		try {
			//shallow copy
		  return super.clone();
		  
		  //Deep Clone
		 /* Student s = new Student(name, subj.getName());*/
		//  return s;
		} catch (CloneNotSupportedException e) {
		  return null;
		}
	  }
	}