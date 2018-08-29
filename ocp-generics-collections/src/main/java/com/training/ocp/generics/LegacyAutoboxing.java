package com.training.ocp.generics;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Pavel Seda
 *
 */
public class LegacyAutoboxing {

	public static void main(String[] args) {
		List nums = new ArrayList();
		nums.add(3);
		// Legacy unboxing
		// int result = nums.get(0); // DOES NOT COMPILE
	}
}
