package multithreadingPrg;

public class InnerThreadCommPrg {
	public static void main(String[] args) throws InterruptedException {
		ThreadA a= new ThreadA();
		a.start();
		synchronized (a) {
			System.out.println("Main Thread trying to call wait() method");
			a.wait();
			System.out.println("Main Thread got notification");
			System.out.println(a.total);
		}
	}

}

class ThreadA extends Thread {
	int total = 0;
	public void run() {
		synchronized (this) {
			System.out.println("Child Thread starts calculation");
			for (int i = 1; i < 100; i++) {
				total=total+i;
			}
			System.out.println("Child Thread trying to send notification");
			this.notify();
		}

	}
}