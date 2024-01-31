package multithreadingPrg;

public class JoinMethodPrg {
	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		t.join();
		for (int i = 1; i < 10; i++) {
			System.out.println("Parent Thread");
			t.sleep(2000);
		}
	}
}

class MyThread2 extends Thread {
 
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
		}
		
	}
}


