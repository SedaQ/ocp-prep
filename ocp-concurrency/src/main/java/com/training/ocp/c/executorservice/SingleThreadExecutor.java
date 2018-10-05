package com.training.ocp.c.executorservice;

import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class SingleThreadExecutor {

	public static void main(String[] args) {
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
}
