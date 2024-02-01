package assignment;

public class MultithreadingAssignment {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("Start Greeting");
		for (int i = 1; i < 10; i++) {
			System.out.println("Hi");
		}
		System.out.println("Stop Greeting");
	}
}

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Hello");
		}
	}
}
