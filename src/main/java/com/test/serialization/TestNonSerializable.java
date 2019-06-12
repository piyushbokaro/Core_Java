package com.test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestNonSerializable {

	public static void main(String args[]) throws Exception {
		File file = new File("temp.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		TestSUID writeSUID = new TestSUID("1");
		writeSUID.setName("Ajith");
		oos.writeObject(writeSUID);
		oos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		TestSUID readSUID = (TestSUID) ois.readObject();
		System.out.println("readSUID.hashCode()" + readSUID.hashCode());
		System.out.println("someId : " + readSUID.getSomeId() + " \t Name :"
				+ readSUID.getName());
		ois.close();
	}

}
