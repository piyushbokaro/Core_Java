package com.test.serialization;

import java.io.Serializable;

class  NonSer 
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

class TestSUID extends NonSer implements Serializable {
	
	
	public TestSUID() {
		System.out.println("Constructor Invoked TestSUID");
	}
	private static final long serialVersionUID = 1L;

	private static  String someId;

	public TestSUID(String someId) {
		this.someId = someId;
	}

	public String getSomeId() {
		return someId;
	}
}
