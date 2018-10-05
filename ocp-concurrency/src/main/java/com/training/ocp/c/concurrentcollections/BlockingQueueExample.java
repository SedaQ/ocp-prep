package com.training.ocp.c.concurrentcollections;

import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BlockingQueueExample {

	public static void main(String[] args) {
		try {
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(42);
			blockingQueue.offer(1, 2, TimeUnit.SECONDS);
			System.out.println(blockingQueue.poll());
			System.out.println(blockingQueue.poll(7, TimeUnit.MILLISECONDS));
		} catch (InterruptedException e) {
			// Handle interruption
		}
	}
}
