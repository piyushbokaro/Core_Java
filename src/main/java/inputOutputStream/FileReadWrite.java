package inputOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileReadWrite {
	public static void main(String[] args) {
		BufferedInputStream bufferedInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			bufferedInputStream = new BufferedInputStream(System.in);
			fileOutputStream = new FileOutputStream("FileReadWrite.txt", true);
			char ch = ' ';
			do{
				ch = (char)bufferedInputStream.read();
				fileOutputStream.write(ch);
			}while(ch != '\n');
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		FileInputStream fileInputStream = null;
		PrintStream printStream = System.out;
		try {
			fileInputStream = new FileInputStream("FileReadWrite.txt");
			System.out.println("Reading Data");
			char ch = ' ';
			do{
				ch = (char)fileInputStream.read();
				printStream.write(ch);
			}while(ch != '\n');
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}	
