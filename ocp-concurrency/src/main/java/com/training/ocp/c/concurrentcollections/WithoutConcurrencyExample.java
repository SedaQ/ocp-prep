package com.training.ocp.c.concurrentcollections;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class WithoutConcurrencyExample {

	private Map<Integer, String> ourSharedData = new HashMap<>();

	public synchronized void put(Integer key, String value) {
		ourSharedData.put(key, value);
	}

	public synchronized String get(Integer key) {
		return ourSharedData.get(key);
	}
}
