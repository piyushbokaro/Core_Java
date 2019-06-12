package com.test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalization {
	public static void main(String args[]) {

		// create a Car object 
		Car car = new Car("Mitsubishi", 2009);
		Car newCar = null;
		File file = new File("TestExternal.ser");
		//serialize the car
		try {
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream so = new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		// de-serialize the Car
		try {
			FileInputStream fi = new FileInputStream(file);
			ObjectInputStream si = new ObjectInputStream(fi);  	    
			newCar = (Car) si.readObject();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		/* 
		 * Print out the original and new car information
		 */
		System.out.print("The original car is -->");
		System.out.println(car);
		System.out.print("The new car is -->");
		System.out.println(newCar);
	}
}
