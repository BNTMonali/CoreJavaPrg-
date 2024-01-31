package assignment;

public class MultithreadingAssignment {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("Main Thread -- Hi");
	}
}

class MyThread extends Thread {
	public void run() {
		System.out.println("Child Thread -- Hello");
	}
}
