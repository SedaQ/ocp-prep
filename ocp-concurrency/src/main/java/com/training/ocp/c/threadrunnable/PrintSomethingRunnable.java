package com.training.ocp.c.threadrunnable;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PrintSomethingRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Print something runnable way...");
		}
	}

	public static void main(String[] args) {
		new Thread(new PrintSomethingRunnable()).start();
	}
}
