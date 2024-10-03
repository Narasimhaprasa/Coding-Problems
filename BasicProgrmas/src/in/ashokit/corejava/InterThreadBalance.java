package in.ashokit.corejava;

class Customer {
	int balance = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if (balance <= amount) {
			System.out.println("Less balance ; waiting for deposit");
			try {
				wait();
			} catch (Exception e) {

			}
		}
		balance = balance - amount;
		System.out.println("With draw completed....+" + balance + "is remaining valance");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		balance = balance + amount;
		System.out.println("deposit is completed..");
		notify();
	}
}

public class InterThreadBalance {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}

}
