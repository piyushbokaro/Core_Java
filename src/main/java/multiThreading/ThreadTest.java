package multiThreading;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread :"+t);
		System.out.println("Current Thread Name:"+t.getName());
		System.out.println("Current Thread Priority:"+t.getPriority());
		ThreadGroup group = t.getThreadGroup();
		System.out.println("Thread Group:"+group.getName());
		
		Thread thread = new Thread("Piyush");
		System.out.println("Thread :"+thread.getName());
		System.out.println("Thread Priority:"+thread.getPriority());
	}
}
