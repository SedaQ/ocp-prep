package com.training.ocp.c.concurrentcollections;

import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BlockingDequeExample {

	public static void main(String[] args) {
		try {
			BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
			blockingDeque.offer(10);
			blockingDeque.offerFirst(1, 2, TimeUnit.MINUTES);
			blockingDeque.offerLast(70, 14, TimeUnit.MICROSECONDS);
			blockingDeque.offer(7, 8, TimeUnit.SECONDS);
			System.out.println(blockingDeque.poll());
			System.out.println(blockingDeque.poll(700, TimeUnit.MILLISECONDS));
			System.out.println(blockingDeque.pollFirst(160, TimeUnit.NANOSECONDS));
			System.out.println(blockingDeque.pollLast(2, TimeUnit.SECONDS));
		} catch (InterruptedException e) {
			// Handle interruption
		}
	}
}
