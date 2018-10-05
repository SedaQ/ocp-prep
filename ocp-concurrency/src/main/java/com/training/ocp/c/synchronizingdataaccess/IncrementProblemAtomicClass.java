package com.training.ocp.c.synchronizingdataaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * @author Pavel Seda
 *
 */
public class IncrementProblemAtomicClass {

	private AtomicInteger numberInSharedEnv = new AtomicInteger(0);

	void incrementSharedEnv() {
		System.out.print(numberInSharedEnv.incrementAndGet() + " ");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			IncrementProblemAtomicClass incManager = new IncrementProblemAtomicClass();
			for (int i = 0; i < 10; i++)
				service.submit(() -> incManager.incrementSharedEnv());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
