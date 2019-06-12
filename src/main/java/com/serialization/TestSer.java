package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SpecialSerial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 940612431574214659L;
	transient int y = 7;
	static int z = 9;
}
public class TestSer {
	public static void main(String[] args) {
		SpecialSerial s = new SpecialSerial();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myFile"));
			oos.writeObject(s);
			oos.close();
			System.out.println(++SpecialSerial.z+" ");
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myFile"));
			SpecialSerial s2 = (SpecialSerial)ois.readObject();
			ois.close();
			System.out.println(s2.y+" "+SpecialSerial.z);
		} catch (Exception e) {
			System.out.println("Exce");
			e.printStackTrace();
		}
	}

}
