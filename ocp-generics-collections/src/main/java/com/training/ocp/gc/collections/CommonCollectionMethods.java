package com.training.ocp.gc.collections;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CommonCollectionMethods {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("1");
		myList.add("2");
		myList.add("3");
		System.out.println(myList);

		myList.remove("1");
		System.out.println(myList.isEmpty());
		System.out.println(myList.contains("2"));
		myList.clear();

		System.out.println(myList);

	}
}
