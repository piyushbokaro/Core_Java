package beginners;

public class StaticTest {
	static int x = 10;
	
	public static void main(String[] args) {
		System.out.println("x1 ::" + x);
	}
	static {
			System.out.println("x2 ::" + x/0);
	}
	static {
		try {
			System.out.println("x3 ::" + x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
