package com.training.ocp.gc.arrays;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class QuizExample {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(new Integer(6));
		nums.add(new Integer(8));
		nums.remove(1);
		nums.remove(new Integer(8));
		System.out.println(nums);
	}
}
