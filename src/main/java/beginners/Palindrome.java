package beginners;

public class Palindrome {

	public static void main(String[] args) {
		int number = 12321, temp = 0, rem = 0;
		temp = number;
		while(temp > 0){
			rem = rem*10 + temp % 10; 
			temp = temp/10;
		}
		if(number == rem){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}
