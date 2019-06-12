package multiThreading;

public class TestExtendsThread {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyThread myThread = new MyThread("Piyush");
		@SuppressWarnings("unused")
		MyThread myThread1 = new MyThread("Kumar");
		@SuppressWarnings("unused")
		MyThread myThread2 = new MyThread("Lucky");
		for(int i = 0;i < 5;i++){
			System.out.println(i + " : By " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e){}
		}
	}
}

class MyThread extends Thread {
	public MyThread(String threadName) {
		super(threadName);
		start();
	}
	
	public void run(){
		for(int i = 0;i < 5;i++){
			System.out.println(i + " : By " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e){}
		}
	}
}
