/*package com.test.io;

import java.io.*;
import java.nio.file.*;

// NOTE: A file with name "file1.pdf" must exist in the program run directory 
// before running this program.
public class TestFileCreator {

	public static void main(String[] args)
			throws Exception {

		String testFile = "examplefile";
		RandomAccessFile raf = new RandomAccessFile(testFile, "rw");
		
		// write data to file

		raf.writeInt(3); // file header
		
		// write 1st record
		
		String data = "1234567890";
		raf.writeInt(data.length()); // write data size
		
		Path path = Paths.get("file1.pdf"); // existing file
		int len = (int) Files.size(path);
		InputStream in = Files.newInputStream(path);
		byte [] bytes = new byte [len];
		in.read(bytes);
		raf.writeInt(len); // write file size

		raf.writeBytes(data);
		raf.write(bytes);

		// write 2nd record
		
		data = "1234";
		raf.writeInt(data.length());
		raf.writeInt(0); // file size = 0
		
		bytes = new byte [0]; // file data
		raf.writeBytes(data);
		raf.write(bytes);	

		// write 3rd record
		
		data = "12345678";
		raf.writeInt(data.length());
		raf.writeInt(0);
		
		bytes = new byte [0];
		raf.writeBytes(data);
		raf.write(bytes);
		
		System.out.println("Test data file created: " + testFile);

		raf.close();
	}
}*/