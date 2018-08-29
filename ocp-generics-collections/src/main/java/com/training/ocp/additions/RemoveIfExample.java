package com.training.ocp.additions;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove conditionaly (removeIf) has following signature:
 * 
 * <pre>
	  <code>
	  	boolean removeIf(Predicate<? super E> filter)
	  </code>
 * </pre>
 * 
 * Look that it is using bounds with super keyword -> because the collection
 * have to be editable (it have to be possible to remove elements from the
 * collection).
 * 
 * @author Pavel Seda
 *
 */
public class RemoveIfExample {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Pavel");
		myList.add("Pepa");
		myList.add("Karel");

		System.out.println("Before removal: " + myList);

		myList.removeIf(str -> str.startsWith("P"));

		System.out.println("After removal:  " + myList);
	}
}
