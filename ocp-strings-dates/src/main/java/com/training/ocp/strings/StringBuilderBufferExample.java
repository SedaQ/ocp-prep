package com.training.ocp.strings;

/**
 * 
 * StringBuffer is synchonized.
 * 
 * StringBuilder is not.
 * 
 * @author Pavel Seda
 *
 */
public class StringBuilderBufferExample {

	public static void main(String[] args) {
		stringBuilder();
		stringBuffer();

		System.out.println();

		speedComparison();
	}

	private static void stringBuilder() {
		StringBuilder sb = new StringBuilder();
		sb.append("1").append("2");
		System.out.println(sb.toString());

	}

	private static void stringBuffer() {
		StringBuffer sb = new StringBuffer();
		sb.append("1").append("2");
		System.out.println(sb.toString());
	}

	private static void speedComparison() {
		int n = 77777777;
		long t;
		StringBuffer strBuffer = new StringBuffer();
		t = System.currentTimeMillis();
		for (int i = n; i-- > 0;) {
			strBuffer.append("");
		}
		System.out.println(System.currentTimeMillis() - t);
		StringBuilder strBuilder = new StringBuilder();
		t = System.currentTimeMillis();
		for (int i = n; i-- > 0;) {
			strBuilder.append("");
		}
		System.out.println(System.currentTimeMillis() - t);
	}

}
