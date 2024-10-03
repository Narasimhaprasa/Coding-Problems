package in.ashokit.corejava;

public class Test01 extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.err.println("Thread is interrupted");
			}
			System.out.println( i+"by"+Thread.currentThread().getPriority());
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main thread is started");
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		Test01 t3 = new Test01();

	 t1.start();
	 t1.join();
	 t2.start();
	 t2.join();
	 t3.start();
	//	System.out.println(Thread.currentThread().getName() + "thread is running");
	}

}
