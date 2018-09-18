package com.training.ocp.ea.exceptions;

/**
 * 
 * Example of proprietary unchecked exception.
 * 
 * @author Pavel Šeda
 *
 */
public class MyUncheckedException extends RuntimeException {

	public MyUncheckedException() {
	}

	public MyUncheckedException(String message) {
		super(message);
	}

	public MyUncheckedException(String message, Throwable ex) {
		super(message, ex);
	}

	public MyUncheckedException(Throwable ex) {
		super(ex);
	}
}
