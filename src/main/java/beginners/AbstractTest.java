package beginners;

public class AbstractTest {
	public static void main(String[] args) {
		new CheckChild().method1();
	}
}

abstract class Check {
	{
		System.out.println("Instance Block");
	}
	static{
		System.out.println("Static Block");
	}
	
	public Check(){
		System.out.println("Abstract Constructor");
	}
	
	public abstract void method1();
}

class CheckChild extends Check{

	public CheckChild(){
		System.out.println("CheckChild Constructor");
	}
	@Override
	public void method1() {
		System.out.println("Inside Child");
	}
	
}
