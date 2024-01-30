package multithreadingPrg;

public class RunnableInterfacePrg {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 1; i < 10; i++) {
			System.out.println("Parent Thread");
		}

	}

}

class MyRunnable implements Runnable {

	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Child Thread");
		}

	}
}
