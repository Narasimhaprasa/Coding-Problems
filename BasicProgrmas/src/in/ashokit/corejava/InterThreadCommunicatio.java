package in.ashokit.corejava;

class SecondThread extends Thread {
	int value = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				value = value + i;
			}
			notify();
		}
	}
}

public class InterThreadCommunicatio {

	public static void main(String[] args) {
		SecondThread b = new SecondThread();
		b.start();
		
		synchronized(b) {
			try {
				  System.out.println("Waiting for b to complete...");
				  b.wait();
			} catch (Exception e) {
				 
			}
			System.out.println("value is ::"+b.value);
		}
	}

}
