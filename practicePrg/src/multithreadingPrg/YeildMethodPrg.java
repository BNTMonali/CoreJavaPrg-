package multithreadingPrg;

public class YeildMethodPrg {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		Thread.yield();
		for (int i = 1; i < 10; i++) {
			System.out.println("Parent Thread");
		}
		
	}

}

class MyThreadB extends Thread {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
		}
		
	}
}


