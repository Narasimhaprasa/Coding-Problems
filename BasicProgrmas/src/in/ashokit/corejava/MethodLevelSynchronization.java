package in.ashokit.corejava;

class Table {
	public static synchronized void printTable(int num) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			 
			Thread.sleep(500);
			System.out.println(num * i + Thread.currentThread().getName());
		}
	}
}

class Thread1 extends Thread {
	Table t;

	Thread1(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread {
	Table t;

	Thread2(Table t) {
		this.t = t;
	}

	public void run() {
		try {
			t.printTable(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class MethodLevelSynchronization {

	public static void main(String[] args) {
		Table obj1 = new Table();
		Thread1 t1 = new Thread1(obj1);
		Thread2 t2 = new Thread2(obj1);
		 
		Table obj2 = new Table();
		Thread1 t3 = new Thread1(obj2);
		Thread2 t4 = new Thread2(obj2);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
