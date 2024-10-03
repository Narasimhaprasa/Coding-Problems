package in.ashokit.corejava;

class ITCProblem implements Runnable {
	int var = 0;

	@Override
	public void run() {
		for (int i = 2; i <= 10; i++) {
			var = var + i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

public class Test {

	public static void main(String[] args) {
		ITCProblem t = new ITCProblem();
		Thread t1 = new Thread(t);
		t1.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		System.out.println(t.var);
	}
 
}
