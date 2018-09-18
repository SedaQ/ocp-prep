package com.training.ocp.ea.exceptions;

import java.io.IOException;
import java.util.Scanner;

/**
 * Quiz examples.
 * 
 * @author Pavel Seda
 *
 */
public class QuizExamples {
	static class AutoImpl implements AutoCloseable {
		@Override
		public void close() throws IOException {
			throw new IOException("AutoImpl close method invoked...");
		}
	}

	static class AutoImpl2 implements AutoCloseable {
		@Override
		public void close() {
			throw new RuntimeException("AutoImpl2 close method invoked...");
		}
	}

	public static void main(String[] args) {
		suprressedExceptions();

		moreCloses();
	}

	/**
	 * 
	 * See we add AutoImpl to the try-with-resources and everything is OK because it
	 * is implementing AutoCloseable interface if we would add, e.g. some String
	 * instance then it will not compile because String is not implementing
	 * AutoCloseable interface.
	 */
	private static void suprressedExceptions() {
		try (AutoImpl impl = new AutoImpl(); AutoImpl2 impl2 = new AutoImpl2();) {
			throw new IOException("Exception in try block occurs.");
		} catch (IOException io) {
			System.out.println("caught: " + io.getMessage());
			for (Throwable t : io.getSuppressed())
				System.out.println(t.getMessage());
		} finally {
			System.out.println("Finally block...");
		}
	}

	public static void moreCloses() {
		try (Scanner cs = new Scanner(System.in)) {
			cs.close(); // CLOSE
			cs.close();
		}
	}

}
