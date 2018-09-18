package com.training.ocp.gc.boxing;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MeasurePerformanceIssue {

	public static void main(String[] args) {
		withAutoboxing();

		System.out.println();

		withoutAutoboxing();
	}

	/**
	 * Autoboxing and Unboxing brings some performance decrease
	 */
	private static void withAutoboxing() {
		long t = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println("total:" + sum);
		System.out.println("processing time: " + (System.currentTimeMillis() - t) + "ms");
	}

	private static void withoutAutoboxing() {
		long t = System.currentTimeMillis();
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println("total:" + sum);
		System.out.println("processing time: " + (System.currentTimeMillis() - t) + "ms");
	}
}
