package beginners;

public class ClassEqualsExample {
	public static void main(String[] args) {
		AA cat = new AA(5);
		AA dog = new AA(5);
		
		System.out.println(cat.equals(dog));
		System.out.println(cat == dog);
		ClassLoader classLoader = ClassEqualsExample.class.getClassLoader();
		try {
			Class cl = classLoader.loadClass("beginners.BitWise");
			Object obj = cl.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class AA{
	int a;
	AA(int a){
		this.a=a;
	}
	
	@Override
	public boolean equals(Object o){
		AA dog = (AA)o;
		if(this.a == dog.a){
			return true;
		} else {
			return false;
		}
	}
}
