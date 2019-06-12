package beginners;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("HelloHelloHello12");
		System.out.println(stringBuffer.capacity());
		StringBuffer stringBuffer1 = new StringBuffer("Hello");
		stringBuffer1.append("HelloHelloHello12");
		System.out.println(stringBuffer1.capacity());
		
	}

}
