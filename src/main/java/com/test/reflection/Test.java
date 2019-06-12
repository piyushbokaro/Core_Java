/*package com.test.reflection;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class Test {
	public static void main(String[] args) {

		
		BeanWrapper student = new BeanWrapperImpl(new Student());
		student.setPropertyValue("studName", "Ram");
		student.setPropertyValue("age", "21");
		student.setPropertyValue("branch","CS");
		BeanWrapper college = new BeanWrapperImpl(new College());
		college.setPropertyValue("name", "SSIC");
		college.setPropertyValue("student", student.getWrappedInstance());
		String name = (String) college.getPropertyValue("student.studName");
		System.out.println(name);
		
		
		Object data = college.getPropertyValue("student");
		
		BeanWrapper dataWrapper = new BeanWrapperImpl(data);
		
		//Student data=(Student) student.getPropertyValue("student");
		
		Set<String> fieldsParam=new HashSet<String>();
		fieldsParam.add("DO_NOT_SEND");
		
		if (fieldsParam.contains("DO_NOT_SEND")) {
			college.setPropertyValue("student", null);
			System.out.println("Exiting");
			return;
		}
		
		for (Field field : data.getClass().getDeclaredFields()) {
			if (!fieldsParam.contains(field.getName())) {
				try {
					dataWrapper.setPropertyValue(field.getName(), null);
					System.out.println("Set-->"+field.getName()+"to Null");
				} catch (Exception ex) {
					System.out.println("Ignoring missing setter for field: " + field.getName());
				}
			} 
		}
		System.out.println("-----Filtered fields----");
		System.out.println(college.getPropertyValue("student.studName"));
	}
}
*/