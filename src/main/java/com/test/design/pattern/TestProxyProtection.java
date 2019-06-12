package com.test.design.pattern;

public class TestProxyProtection {

	public static void main(String[] args) {
		 InternetAccess ia = new ProxyInternetAccess("Ajith");
         ia.grantInternetAccess();

	}
	 
}
