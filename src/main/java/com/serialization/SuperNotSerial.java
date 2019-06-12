package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SuperNotSerial {
	public static void main(String[] args) {
		Dog d = new Dog("Brook", 40);
		System.out.println("Name :"+d.name+" Weight :."+d.weight);
		try {
			FileOutputStream fos = new FileOutputStream("Dog.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
		} catch (Exception e) {
		}
		try {
			FileInputStream fis = new FileInputStream("Dog.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog)ois.readObject();
			ois.close();
		} catch (Exception e) {
		}
		System.out.println("Name :"+d.name+" Weight :."+d.weight);
	}
}
class Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8506017259306390478L;
	int weight = 50;
}
class Dog extends Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2696069933044831275L;
	String name;
	Dog(String n, int w){
		name = n;
		weight = w;
	}
}
