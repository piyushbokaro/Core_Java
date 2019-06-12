package beginners;

public class FinallyTest {

	public static void main(String[] args) {
		System.out.println(new FinallyTest().sum());
	}
	
	public int sum(){
		int x = 0;
		try {
			x += 50;
			return x;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("x  ::" + x);
			x = 10;
			System.out.println("x1 ::" + x);
		}
		return 1;
	}
}
