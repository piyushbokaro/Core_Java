package beginners;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solutions {
	public static void main(String[] args) {
		int[] ar = {2, 4, 6, 8, 3};
		insertIntoSorted(ar);
	}
	
	public static void insertIntoSorted(int[] ar) {
        int sizeOfArray = ar.length;
        if(sizeOfArray > 0 && sizeOfArray <= 1000){
           int x = ar[sizeOfArray-1];
            if(x >= -10000 && x <= 10000){
                for(int j = sizeOfArray-1-1;j >= -1;j--){
                	if(j >= 0){
                		if(ar[j] >= x){
                			ar[j+1] = ar[j];
                		} else {
                			if(j == 0){
                				ar[j] = x;
                			} else {
                				x = ar[j];
                			}
                		}
                	} else {
                		if(ar[0] > x){
                			ar[0] = x;
                		}
                	}
                    for(int z = 0;z < sizeOfArray;z++){
                        System.out.print(ar[z] + " ");
                    }
                    System.out.println();
			     }    
            }
        }
    }
}
