package beginners;

public class Prime extends A{
	public static void main(String[] args) {
		int number = 99;
		boolean isPrime = false;
		for(int i = 2;i < number/2;i++) {
			if(number % i == 0){
				isPrime = true;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number + " is a Prime Number");
		} else {
			System.out.println(number + " is not a Prime Number");
		}
	}
	
	public Integer sum(int x, int y){
		
		return x+y;
	}
}

class A{
	public Long sum(long x, long y){
		return x+y;
	}
}
