package beginners;

public class FibonacciRecursive {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	
	public static int fibonacci(int number){
		if(number == 1 || number == 2){
			return 1;
		}
		return fibonacci(number-2) + fibonacci(number-1);
	}
}
