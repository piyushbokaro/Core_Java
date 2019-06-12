package beginners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String[] args) {
		try {
			Class<? extends Object> class1 = Class.forName("beginners.Reflection");
			Object obj = class1.newInstance();
			System.out.println("Class Loaded :" + class1.getName());
			Method method = class1.getDeclaredMethod("print", null);
			method.invoke(obj, null);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Reflection{
	public Reflection(){
		System.out.println("Contructor");
	}
	
	public void print(){
		System.out.println("Piyush");
	}
	
}
