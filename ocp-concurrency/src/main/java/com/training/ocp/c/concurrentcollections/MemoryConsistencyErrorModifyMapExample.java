package com.training.ocp.c.concurrentcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MemoryConsistencyErrorModifyMapExample {

	public static void main(String[] args) {
		// nonConcurrentCollectionModify();

		concurrentCollectionModify();
	}

	/**
	 * This one may throw java.util.ConcurrentModificationException
	 */
	private static void nonConcurrentCollectionModify() {
		Map<Integer, String> employees = new HashMap<>();
		employees.put(1, "pavel");
		employees.put(2, "petr");
		for (Integer key : employees.keySet())
			employees.remove(key);
	}

	private static void concurrentCollectionModify() {
		Map<Integer, String> employees = new ConcurrentHashMap<>();
		employees.put(1, "pavel");
		employees.put(2, "petr");
		for (Integer key : employees.keySet())
			employees.remove(key);
	}

}
