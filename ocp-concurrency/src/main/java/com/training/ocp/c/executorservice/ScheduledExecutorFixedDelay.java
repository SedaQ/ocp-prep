package com.training.ocp.c.executorservice;

import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ScheduledExecutorFixedDelay {

	public static void main(String[] args) {
		ScheduledExecutorService service = null;
		try {
			service = Executors.newSingleThreadScheduledExecutor();
			service.scheduleWithFixedDelay(() -> System.out.println("Make a coffee"), 10, 10, TimeUnit.SECONDS);
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
