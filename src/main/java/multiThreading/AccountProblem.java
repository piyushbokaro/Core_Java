package multiThreading;

public class AccountProblem {
	public static void main(String[] args) {
		new AccountHolder();
	}
}
class Account{
	int balance = 5000;
	
	public int getBalance(){
		return balance;
	}
	
	public synchronized void withdrawAmount(int amount){
		if(getBalance() > amount) {
			System.out.println(Thread.currentThread().getName() + " is Withdrawing amount. Balance is " + getBalance());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance -= amount;
			System.out.println(Thread.currentThread().getName() + " has Withdrawn amount. Balance is " + getBalance());
		} else {
			System.out.println("Insufficient Balance");
		}
	}
}

class AccountHolder implements Runnable {
	Account account = new Account();
	public AccountHolder() {
		Thread thread1 = new Thread(this, "Piyush");
		Thread thread2 = new Thread(this, "Kumar");
		thread1.start();
		thread2.start();
	}
	
	public void run() {
		for(int i =0;i < 5;i++) {
			account.withdrawAmount(900);
		}
	}
}