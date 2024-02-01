package executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableNFuturePrg {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Mycallable[] jobs = { new Mycallable(30), new Mycallable(20), new Mycallable(10), new Mycallable(40),
				new Mycallable(50), };
		ExecutorService services = Executors.newFixedThreadPool(3);
		for (Mycallable job : jobs) {
			Future<Integer> f = services.submit(job);
			System.out.println(f.get());
		}
		services.shutdown();
	}
}

class Mycallable implements Callable<Integer> {

	int num;

	public Mycallable(int num) {
		super();
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(
				Thread.currentThread().getName() + "  is responsible to find sum of first " + num + " numbers");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

}