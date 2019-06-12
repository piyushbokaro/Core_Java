package com.serialization;
import java.io.*;

@SuppressWarnings("serial")
public class Forest implements Serializable {
	public static void main(String [] args) {
		Dog1 d = new Dog1(35, "Fido");
		try {
			FileOutputStream fs = new FileOutputStream("Forest.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d); os.close();
		} catch (Exception ex) { ex.printStackTrace(); }
	} 
}
class Animal1 {
	int weight;
}
@SuppressWarnings("serial")
class Dog1 extends Animal1 implements Serializable{
	String name;
	public Dog1(int w, String n){
		weight = w;
		name = n;
	}
	
}
