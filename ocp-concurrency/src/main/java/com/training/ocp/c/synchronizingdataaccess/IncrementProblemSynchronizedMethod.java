package com.training.ocp.c.synchronizingdataaccess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class IncrementProblemSynchronizedMethod {

	private int numberInSharedEnv = 0;

	private synchronized void incrementSharedEnv() {
		System.out.print((++numberInSharedEnv) + " ");
	}

	private void incrementSharedEnvSynchronizedBlock() {
		synchronized (IncrementProblemSynchronizedMethod.class) {
			System.out.print((++numberInSharedEnv) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			IncrementProblemSynchronizedMethod incManager = new IncrementProblemSynchronizedMethod();
			for (int i = 0; i < 10; i++) {
				service.submit(() -> incManager.incrementSharedEnv());
			}
		} finally {
			if (service != null)
				service.shutdown();
		}
	}

}
