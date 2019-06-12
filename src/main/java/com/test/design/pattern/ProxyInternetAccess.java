package com.test.design.pattern;

public class ProxyInternetAccess implements InternetAccess {
	private String employeeName = null;

	public ProxyInternetAccess(String empName) {
		this.employeeName = empName;
	}

	public void grantInternetAccess() {
		System.out.println("Internet Access granted for employee: "
				+ employeeName);
	}
}
