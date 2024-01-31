package multithreadingPrg;

public class SynchronizationPrg {
	public static void main(String[] args) {
		Display d = new Display();
		MyThreadS t1 = new MyThreadS(d, "Ravi");
		MyThreadS t2 = new MyThreadS(d, "Sujay");
		t1.start();
		t2.start();
	}
}

class MyThreadS extends Thread {
	Display d;
	String name;

	MyThreadS(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

class Display {
	public synchronized void wish(String name) {
		for (int i = 1; i < 10; i++) {
			System.out.println("Good Morning  :" + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(name);
			}
		}
	}
}