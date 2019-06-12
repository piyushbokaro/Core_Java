package com.piyush;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {

	public static void main(String[] args) {
		String text = "I will come and meet you at the woods 123woods and all the woods";
		int count = 0;
		Pattern pattern = Pattern.compile("and");
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			count++;
		}
		System.out.println("and found " + count + " times");
	}

}
