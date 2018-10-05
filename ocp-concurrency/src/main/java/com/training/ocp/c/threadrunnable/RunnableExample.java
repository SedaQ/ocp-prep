package com.training.ocp.c.threadrunnable;

/**
 * 
 * @author Pavel Seda
 *
 */
public class RunnableExample implements Runnable {

	private String[] names;
	
	public RunnableExample(String[] names) {
		this.names = names;
	}
	
	@Override
	public void run() {
		//work that uses names object
	}

}
