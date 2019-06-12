package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class CreateFile {
	public static void main(String[] args) {
		File file = new File("Abc.txt");
		Scanner scanner = null;
		FileWriter fileWriter = null;
		String str = "";
		try {
			fileWriter = new FileWriter(file);
			scanner = new Scanner(System.in);
			while (!str.equalsIgnoreCase("E")) {
				str = scanner.nextLine();
				fileWriter.write(str + "\n");
			}
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				str = scanner.nextLine();
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
