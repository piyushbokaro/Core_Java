package com.test.core;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetHostName {

	public static String getHostServerName() {
		String hostName = "";
		int idx = 0;
		try {
			hostName = InetAddress.getLocalHost().getHostName();
			if (hostName != null && hostName.indexOf(".") != 1) {
				idx = hostName.indexOf(".");
				if (idx != -1) {
					hostName = hostName.substring(0, idx);
				}
			}
		} catch (UnknownHostException uEx) {
		}
		// Get IP AddressgetHost
		return hostName;
	}
	public static void main(String[] args) throws UnknownHostException {
		
		System.out.println(getHostServerName());
		/*String s="allstate";
		char[] copy = new char[s.length()];
		char  original[] = s.toCharArray();
		
		
		System.arraycopy(original, 0, copy, 0,
				                        Math.min(original.length, s.length()));
		System.out.println(copy);*/
		

	}
}
