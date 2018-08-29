package com.training.ocp.collections;

import java.util.*;

/**
 * 
 * A set is a collection that does not allow duplicate entries.
 * 
 * @author Pavel Seda
 *
 */
public class SetExample {

	public static void main(String[] args) {
		hashSetExample();
		treeSetExample();
		navigableSetExample();
	}

	public static void hashSetExample() {
		Set<String> setOfStrings = new HashSet<>();
		setOfStrings.add("test1");
		setOfStrings.add("test2");
		setOfStrings.add("test3");
		setOfStrings.add("test1");

		// see that elements are not sorted..
		System.out.println(setOfStrings);
	}

	/**
	 * Tree set is using Red Black Tree algorithm for adding elements in sorted
	 * order.
	 */
	public static void treeSetExample() {
		Set<String> setOfStrings = new TreeSet<>();
		setOfStrings.add("test1");
		setOfStrings.add("test2");
		setOfStrings.add("test3");
		setOfStrings.add("test1");

		// see that elements are sorted
		System.out.println(setOfStrings);
	}

	/**
	 * TreeSet implements NavigableSet interface. This interface provides some
	 * interesting methods.
	 * 
	 * <pre>
	 <code>
		E lower(E e) Returns greatest element that is < e, or null if no such element
		E floor(E e) Returns greatest element that is <= e, or null if no such element
		E ceiling(E e) Returns smallest element that is >= e, or null if no such element
		E higher(E e) Returns smallest element that is > e, or null if no such element	 
	 </code>
	 * </pre>
	 * 
	 */
	public static void navigableSetExample() {
		NavigableSet<Integer> setOfNums = new TreeSet<>();
		for (int i = 1; i <= 50; i++) {
			setOfNums.add(i);
		}
		System.out.println(setOfNums.lower(30)); // 29
		System.out.println(setOfNums.floor(30)); // 30
		System.out.println(setOfNums.ceiling(50)); // 50
		System.out.println(setOfNums.higher(50)); // null

	}
}
