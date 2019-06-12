package beginners;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(5));
	}
	
	public static int recursiveFactorial(int num){
		if(num <= 1){
			return 1;
		}
		return num * recursiveFactorial(num-1);
	}
}
