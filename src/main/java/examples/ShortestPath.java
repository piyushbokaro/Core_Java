package examples;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ShortestPath {

	static int ED(int c[][], int m, int n){
		int t[][] = new int[m+1][n+1];
		t[0][0] = c[0][0];
		for(int i=1;i<=m;i++){
			t[i][0] = t[i-1][0]+c[i][0];
		}
		for(int j=1;j<=n;j++){
			t[0][j] = t[0][j-1]+c[0][j];
		}
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				t[i][j] = Math.min(Math.min(t[i-1][j-1],t[i-1][j]),t[i][j-1])+c[i][j];
			}
		}
		return t[m][n];
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int c[][] = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j] = sc.nextInt();
			}
		}
		System.out.println(ED(c, 2, 2));
	}
}
