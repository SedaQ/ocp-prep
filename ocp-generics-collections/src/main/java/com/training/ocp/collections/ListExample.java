package com.training.ocp.collections;

import java.util.*;

/**
 * A list is an ordered collection of elements that allows duplicate entries.
 * Elements in a list can be accessed by an int index.
 * 
 * NOTE: Vector is synchronized ArrayList, but pay attention since newer
 * versions of java there are better ways how to achieve synchronized
 * collections, e.g. CopyOnWriteArrayList
 * 
 * @author Pavel Seda
 *
 */
public class ListExample {

	public static void main(String[] args) {
		setMethodExample();
		// getMethodExample();
		// arraysAsListMethodExample();
	}

	/**
	 * Set method example.
	 * 
	 * What will be printed?
	 * 
	 */
	public static void setMethodExample() {
		List<String> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add("World");

		myList.set(0, "!");

		System.out.println(myList);
	}

	/**
	 * Indexes started from zero or one?
	 * 
	 * What will be printed?
	 * 
	 */
	public static void getMethodExample() {
		List<String> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add("World");
		System.out.println(myList.get(1));
	}

	/**
	 * What will be printed?
	 */
	public static void arraysAsListMethodExample() {
		List<String> myList = Arrays.asList("Hello", "World", "!");
		myList.set(0, "Hello ");
		myList.remove(2);
		System.out.println(myList);
	}

	/**
	 * LinkedList implements both List and Queue interfaces. It has all of the
	 * methods fo a List and also additional (due to implementing Queue interface)
	 * like adding or removing elements from the beginning or from the end of the
	 * set.
	 */
	public static void arrayListAndLinkedList() {
		LinkedList<String> s2 = new LinkedList<>();
		s2.addFirst("First");
		ArrayList<String> s1 = new ArrayList<>();
		// s1.addFirst("First");
	}

	/**
	 * pay special attention between hasNext() and next() method.. next returns next
	 * element while hasNext() is just checking if it has next element
	 */
	public static void loopingThroughList() {
		List<String> myList = new ArrayList<>();
		myList.add("Hello");
		myList.add("World");

		// old way using iterator
		Iterator iteratorNonGeneric = myList.iterator();
		while (iteratorNonGeneric.hasNext()) {
			String s = (String) iteratorNonGeneric.next();
			System.out.println(s);
		}

		// generic way using iterator
		Iterator<String> iteratorWithGeneric = myList.iterator();
		while (iteratorWithGeneric.hasNext()) {
			String s = iteratorWithGeneric.next();
			System.out.println(s);
		}
	}

}
