package com.piyush;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		String str = "User settings file does not exist . No index update available for central";
		String str1[] = str.split(" ");
		int count = 0;
		HashMap<String, String> hmStr = new HashMap<String, String>();
		for(int i = 0; i<str1.length;i++){
			hmStr.put(str1[i], str1[i]);
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i = 0; i<hmStr.size();i++){
			for(int j = 0; i<hmStr.size();i++){
				if(hmStr.keySet().iterator().hasNext()==hmStr.keySet().iterator().hasNext()){
					count++;
				//	hmStr.keySet().iterator().remove();
				}
				hmStr.keySet().iterator().next();
			}
			hm.put(hmStr.get(i), count);
		}
		System.out.println(hm.size());
	}
}
