package com.training.ocp.c.synchronizingdataaccess;

import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class IncrementingProblem {

	private int numberInSharedEnv = 0;

	void incrementSharedEnv() {
		System.out.print((++numberInSharedEnv) + " ");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			IncrementingProblem incManager = new IncrementingProblem();
			for (int i = 0; i < 10; i++)
				service.submit(() -> incManager.incrementSharedEnv());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
