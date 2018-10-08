package com.training.ocp.c.managingprocesses.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class InterviewingManagerCyclicBarrierUsed {

	private void hrInterview() {
		System.out.println("HR round");
	}

	private void technicalInterview() {
		System.out.println("Technical round");
	}

	private void managerInterview() {
		System.out.println("Managers round");
	}

	public void performInterview(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			hrInterview();
			c1.await();
			technicalInterview();
			c2.await();
			managerInterview();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(3);
			InterviewingManagerCyclicBarrierUsed manager = new InterviewingManagerCyclicBarrierUsed();
			CyclicBarrier c1 = new CyclicBarrier(3);
			CyclicBarrier c2 = new CyclicBarrier(3);
			for (int i = 0; i < 3; i++)
				service.submit(() -> manager.performInterview(c1, c2));
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
