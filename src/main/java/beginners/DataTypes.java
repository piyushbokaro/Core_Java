package beginners;

public class DataTypes {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean b1;
	float f1 = 10.9f;
	final int x = 99;

	public void show1() {
		System.out.println("Variable and Constant Demao");
		System.out.println("Byte    ::" + b);
		System.out.println("Short   ::" + s);
		System.out.println("Int     ::" + i);
		System.out.println("Long    ::" + l);
		System.out.println("Float   ::" + f);
		System.out.println("Double   :" + d);
		System.out.println("char    ::" + ch);
		System.out.println("Boolean ::" + b1);
		System.out.println("Float f1::" + f1);
		System.out.println("Final Int:" + x);
	}
	
	public void show2() {
		System.out.println("Integer Literal Demao");
		int a = 12;
		int b = 012;
		int c = 0x12a;
		byte d = 012;
		System.out.println("Int a::" + a);
		System.out.println("Int b::" + b);
		System.out.println("Int c::" + c);
		System.out.println("Byte ::" + d);
	}
	
	public void show3() {
		System.out.println("Floating Point Literal Demo");
		float f1 = 99.9f;
		double d1 = 9.9e-9;
		double d2 = 9.9e+9;
		System.out.println("Float   ::" + f1);
		System.out.println("Double d1:" + d1);
		System.out.println("Double d2:" + d2);
	}
	
	public void show4(){
		System.out.println("Character Literal Demo");
		char ch1 = 'A';
		int x1 = 'A';
		char ch2 = ' ';
		int x2 = ' ';
		char ch3 = '1';
		char x3 = '1';
		System.out.println("Char ch1::" + ch1);
		System.out.println("Int x1  ::" + x1);
		System.out.println("Char ch2::" + ch2);
		System.out.println("Char x2 ::" + x2);
		System.out.println("Char ch3::" + ch3);
		System.out.println("Char x3 ::" + x3);
	}
	
	public void show5() {
		System.out.println("String Loteral Demo");
		String str1 = " ";
		String str2 = " 123 abc + ";
		System.out.println("String str1 ::" + str1);
		System.out.println("String str1 Length ::" + str1.length());
		System.out.println("String str2 ::" + str2);
		System.out.println("String str2 Length ::" + str2.length());
	}
	
	public static void main(String[] args) {
		new DataTypes().show1();
		new DataTypes().show2();
		new DataTypes().show3();
		new DataTypes().show4();
		new DataTypes().show5();
	}
}
