package com.training.ocp.additions;

import java.util.Arrays;
import java.util.List;

/**
 * Update all has following signature:
 * 
 * <pre>
	  <code>
	  	void replaceAll(UnaryOperator<E> o)
	  </code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class UpdateAllExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		list.replaceAll(x -> x * 2);
		System.out.println(list); // [30, 60, 90]
	}
}
