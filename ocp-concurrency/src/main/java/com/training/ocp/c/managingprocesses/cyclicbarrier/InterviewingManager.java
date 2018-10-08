package com.training.ocp.c.managingprocesses.cyclicbarrier;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class InterviewingManager {

	private void hrInterview() {
		System.out.println("HR round");
	}

	private void technicalInterview() {
		System.out.println("Technical round");
	}

	private void managerInterview() {
		System.out.println("Managers round");
	}

	public void performInterview() {
		hrInterview();
		technicalInterview();
		managerInterview();
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(3);
			InterviewingManager manager = new InterviewingManager();
			for (int i = 0; i < 3; i++)
				service.submit(() -> manager.performInterview());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
