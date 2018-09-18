package com.training.ocp.ea.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Example of method and usage of throw and throws
 * 
 * @author Pavel Seda
 *
 */
public class ThrowVsThrowsExample {

	public static void main(String[] args) {

		try {
			someMethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void someMethod() throws IOException {
		throw new FileNotFoundException();
	}
}
