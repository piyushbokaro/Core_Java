package beginners;

public class Fibonacci {
	public static void main(String[] args) {
		for(int i = 0;i < 4;i++ ){
			System.out.print(recursiveFibonacci(i) + " ");
		}
	}

	public static int recursiveFibonacci(int num) {
		if(num == 0 || num == 1){
			return num;
		}
		return recursiveFibonacci(num-1) + recursiveFibonacci(num-2);
	}
}
