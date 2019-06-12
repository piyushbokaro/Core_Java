package beginners;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StringReverse {

	public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        long starttime = System.currentTimeMillis();
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer:::: " + reverseStr);
        System.out.println("StringBuffer Time " + (System.currentTimeMillis() - starttime) + "ms" );
        
        //iterative method to reverse String in Java
        starttime = System.currentTimeMillis();
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration:::: " + reverseStr);
        System.out.println("Iteration Time " + (System.currentTimeMillis() - starttime) + "ms" );
        
        //recursive method to reverse String in Java
        starttime = System.currentTimeMillis();
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion:::: " + reverseStr);
        System.out.println("Recursive Time " + (System.currentTimeMillis() - starttime) + "ms" );
        
    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
