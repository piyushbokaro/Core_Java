package com.test.design.pattern;

public class RealInternetAccess implements InternetAccess {
	private String employeeName = null;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: "
				+ employeeName);
	}
}
