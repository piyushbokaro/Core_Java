package com.test.sort;

import java.util.Comparator;

public class StudentCompare {
	private String studentname;
	private int rollno;
	private int studentage;

	public StudentCompare(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}
	//Getter and setter methods same as the above examples

	/*Comparator for sorting the list by Student Name*/
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
			String StudentName1 = s1.getStudentname().toUpperCase();
			String StudentName2 = s2.getStudentname().toUpperCase();

			//ascending order
			return StudentName1.compareTo(StudentName2);

			//descending order
			//return StudentName2.compareTo(StudentName1);
		}
	};

		/*Comparator for sorting the list by roll no*/
		public static Comparator<Student> StuRollno = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {

				int rollno1 = s1.getRollno();
				int rollno2 = s2.getRollno();

				/*For ascending order*/
				return rollno1-rollno2;

				/*For descending order*/
				//rollno2-rollno1;
			}};
			@Override
			public String toString() {
				return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
			}
}
