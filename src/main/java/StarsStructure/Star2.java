package StarsStructure;
/*
 
 				*
 		 	   ***
 		 	  *****
 		 	 *******
 
 */
public class Star2 {
	public static void main(String[] args) {
		int n = 7;//n here is number of lines
		int a = 0;
		for(int i = n;i > 0;i--){
			for(int j = 0;j < i;j++){
				System.out.print(" ");
			}
			for(int k = 0;k <= a;k++){
				System.out.print("*");
			}
			System.out.println();
			a += 2;
		}
	}
}
