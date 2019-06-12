package multiThreading;

import java.util.Vector;

public class ProducerConsumer {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		Thread thread1 = new Thread(new Producer(vector, 4), "Producer");
		Thread thread2 = new Thread(new Consumer(vector, 4), "Consumer");
		thread1.start();
		thread2.start();
	}
}

class Producer implements Runnable{
	Vector<Integer> vector;
	public final int size;
	public Producer(Vector<Integer> vector, int size){
		this.vector = vector;
		this.size = size;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void produce(int i) throws InterruptedException{
		while(vector.size() == size){
			synchronized (vector) {
				System.out.println("List is Full. Waiting to get it Emplty");
				vector.wait();
			}
		}
		synchronized (vector) {
			System.out.println("Produced ::" + i);
			vector.add(i);
			vector.notifyAll();
		}
		
		
	}
}

class Consumer implements Runnable{
	Vector<Integer> vector;
	final int size;
	public Consumer(Vector<Integer> vector, int size) {
		this.vector = vector;
		this.size = size;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void consume() throws InterruptedException{
		while(vector.isEmpty()){
			synchronized (vector) {
				System.out.println("List is Empty. Nothing to Consume");
				vector.wait();
			}
		}
		synchronized (vector) {
			System.out.println("Consumed ::" + vector.get(0));
			vector.notifyAll();
			vector.remove(0);
		}
	}
}