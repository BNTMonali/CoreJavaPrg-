package executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFrameworkPrg {
	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("sunny"), new PrintJob("bunny"), new PrintJob("gunny"), new PrintJob("munny"),
				new PrintJob("hunny") };
		ExecutorService service = Executors.newFixedThreadPool(2);
		for (PrintJob job : jobs) {
			service.submit(job);
		}
		service.shutdown();
	}
}

class PrintJob implements Runnable {
	String name;
	public PrintJob(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + "    job started by Thread" + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		System.out.println(name + "    job completed by Thread" + Thread.currentThread().getName());
	}

}
