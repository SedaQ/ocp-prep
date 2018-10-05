package com.training.ocp.c.threadrunnable;

/**
 * 
 * How many times this code will be invoked?
 * 
 * @author Pavel Seda
 *
 */
public class CountingExample {

	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			for (int i = 0; i < 100; i++)
				CountingExample.counter++;
		}).start();
		while (CountingExample.counter < 50) {
			System.out.println("Not reached yet");
			// Thread.sleep(3000); // 3 seconds
		}
		System.out.println("Reached!");
	}
}
