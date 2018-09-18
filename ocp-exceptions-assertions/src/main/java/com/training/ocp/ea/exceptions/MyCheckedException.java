package com.training.ocp.ea.exceptions;

/**
 * Example of proprietary checked exception.
 * 
 * 
 * @author Pavel Seda
 *
 */
public class MyCheckedException extends Exception {

	public MyCheckedException() {
	}

	public MyCheckedException(String message) {
		super(message);
	}

	public MyCheckedException(String message, Throwable ex) {
		super(message, ex);
	}

	public MyCheckedException(Throwable ex) {
		super(ex);
	}

}
