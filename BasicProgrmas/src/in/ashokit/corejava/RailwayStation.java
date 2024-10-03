package in.ashokit.corejava;

class Reserve implements Runnable {
	int available = 1;
	int wanted;

	Reserve(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {
		System.out.println("Availabel berth ::" + available);
		if (available >= wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted + "berth reserved for" + name);
			available = available - wanted;
		} else {
			System.out.println("Sorry! No berth is available");
		}
	}

}

public class RailwayStation {

	public static void main(String[] args) {
		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r);
		t1.setName("Rohit");
		
		Thread t2 = new Thread(r);
		t2.setName("virat");
		
		t1.start();
		t2.start();
	}

}
