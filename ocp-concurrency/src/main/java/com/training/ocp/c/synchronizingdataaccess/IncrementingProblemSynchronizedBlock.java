package com.training.ocp.c.synchronizingdataaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class IncrementingProblemSynchronizedBlock {

	private int numberInSharedEnv = 0;

	private void incrementSharedEnv() {
		synchronized (this) {
			System.out.print((++numberInSharedEnv) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			IncrementingProblemSynchronizedBlock incManager = new IncrementingProblemSynchronizedBlock();
			for (int i = 0; i < 10; i++) {
				// What is the problem here? We do not synchronize the execution
				// synchronized (incManager) {
				// service.submit(() -> incManager.incrementSharedEnv());
				// }
				service.submit(() -> incManager.incrementSharedEnv());
			}
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
