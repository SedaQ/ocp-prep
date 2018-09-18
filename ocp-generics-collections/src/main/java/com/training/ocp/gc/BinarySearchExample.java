package com.training.ocp.gc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Binary search assumes that the input is sorted.
 * 
 * If element is not present than it returns index where it should be * (-1).
 * 
 * In case the array/collection is not sorted than the results are undefined.
 * 
 * @author Pavel Seda
 *
 */
public class BinarySearchExample {

	public static void main(String[] args) {
		binarySearchArrayExample();

		System.out.println();
		binarySearchCollectionExample();

		System.out.println();
		binarySearchCollectionNotSortedExample();
	}

	private static void binarySearchArrayExample() {
		int[] nums = { 8, 9, 1, 3 };
		Arrays.sort(nums);
		System.out.println(Arrays.binarySearch(nums, 1)); // 0
		System.out.println(Arrays.binarySearch(nums, 8)); // 2
		System.out.println(Arrays.binarySearch(nums, 4)); // -3
	}

	private static void binarySearchCollectionExample() {
		List<Integer> myList = Arrays.asList(2, 3, 6, 10);
		Collections.sort(myList);
		System.out.println(Collections.binarySearch(myList, 2)); // 0
		System.out.println(Collections.binarySearch(myList, 1)); // -1
	}

	private static void binarySearchCollectionNotSortedExample() {
		List<Integer> myList = Arrays.asList(10, 3, 6, 2);
		System.out.println(Collections.binarySearch(myList, 2)); // ?
		System.out.println(Collections.binarySearch(myList, 10)); // ?
	}

}
