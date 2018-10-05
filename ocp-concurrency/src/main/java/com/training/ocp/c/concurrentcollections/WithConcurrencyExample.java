package com.training.ocp.c.concurrentcollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 
 * @author Pavel Seda
 *
 */
public class WithConcurrencyExample {

	private Map<Integer, String> ourSharedData = new ConcurrentHashMap<>();

	public void put(Integer key, String value) {
		ourSharedData.put(key, value);
	}

	public String get(Integer key) {
		return ourSharedData.get(key);
	}

}
