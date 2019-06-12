package inputOutputStream;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ReadNDisplayUsingKeyboard {
	public static void main(String[] args) {
		InputStream inputStream = new BufferedInputStream(System.in);
		PrintStream printStream = System.out;
		
		char ch = ' ';
		try {
			do {
				int x = inputStream.read();
				ch = (char)x;
				printStream.write(ch);
			} while (ch != '\n');
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
