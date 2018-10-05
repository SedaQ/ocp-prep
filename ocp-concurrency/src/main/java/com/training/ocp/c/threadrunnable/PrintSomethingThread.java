package com.training.ocp.c.threadrunnable;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PrintSomethingThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("Print something thread way...");
		}
	}

	public static void main(String[] args) {
		new PrintSomethingThread().start();
	}

}
