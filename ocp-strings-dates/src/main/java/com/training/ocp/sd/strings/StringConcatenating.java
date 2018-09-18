package com.training.ocp.sd.strings;

/**
 * 
 * @author Pavel Seda
 *
 */
public class StringConcatenating {

	public static void main(String[] args) {
		String s1 = "1" + 2 + 3;
		String s2 = 1 + 2 + "3";
		System.out.println(s1); // 123
		System.out.println(s2); // 33
	}
}
