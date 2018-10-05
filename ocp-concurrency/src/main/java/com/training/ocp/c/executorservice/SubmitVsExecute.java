package com.training.ocp.c.executorservice;

import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class SubmitVsExecute {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		executeExample();

		System.out.println(System.lineSeparator());

		submitExample();
	}

	private static void executeExample() {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("START");
			service.execute(() -> System.out.println("Printing employees"));
			service.execute(() -> {
				for (int i = 0; i < 5; i++)
					System.out.println("Employee record: " + i);
			});
			service.execute(() -> System.out.println("Printing employees"));
			System.out.println("END");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

	private static void submitExample() throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("START");
			service.submit(() -> System.out.println("Printing employees"));
			Future<Long> futureObj = service.submit(() -> {
				for (int i = 0; i < 5; i++)
					System.out.println("Employee record: " + i);
				return System.currentTimeMillis();
			});
			service.submit(() -> System.out.println("Printing employees"));
			System.out.println("END");
			System.out.println(futureObj.get());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
