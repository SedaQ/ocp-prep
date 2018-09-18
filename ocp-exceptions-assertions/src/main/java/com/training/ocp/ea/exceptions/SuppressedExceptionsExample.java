package com.training.ocp.ea.exceptions;

import java.io.IOException;

/**
 * 
 * @author Pavel Seda
 *
 */
public class SuppressedExceptionsExample {
	static class AutoImpl implements AutoCloseable {
		@Override
		public void close() throws IOException {// something
			throw new IOException("AutoImpl close method invoked... and throws IOException..");
		}
	}

	public static void main(String[] args) {
		suprressedExceptions();
	}

	/**
	 * 
	 * See we add AutoImpl to the try-with-resources and everything is OK because it
	 * is implementing AutoCloseable interface if we would add, e.g. some String
	 * instance then it will not compile because String is not implementing
	 * AutoCloseable interface.
	 */
	private static void suprressedExceptions() {
		try (AutoImpl impl = new AutoImpl();) {
			throw new IOException("Exception in try block occurs.");
		} catch (IOException io) {
			System.out.println("caught: " + io.getMessage());
			for (Throwable t : io.getSuppressed())
				System.out.println(t.getMessage());
		}
	}

}
