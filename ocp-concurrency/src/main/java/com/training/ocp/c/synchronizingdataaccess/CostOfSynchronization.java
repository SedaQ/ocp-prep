package com.training.ocp.c.synchronizingdataaccess;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CostOfSynchronization {

	public static void main(String[] args) {
		CostOfSynchronization c = new CostOfSynchronization();

		c.withSync();
		c.withoutSync();
	}

	private synchronized void withSync() {
		Map<Integer, String> map = new HashMap<>();
		Instant before = Instant.now();
		for (int i = 0; i < 10000000; i++) {
			map.put(i, "benchMarkTest");
		}
		Instant after = Instant.now();
		System.out.println(Duration.between(before, after).toMillis());
	}

	private void withoutSync() {
		Map<Integer, String> map = new HashMap<>();
		Instant before = Instant.now();
		for (int i = 0; i < 10000000; i++) {
			map.put(i, "benchMarkTest");
		}
		Instant after = Instant.now();
		System.out.println(Duration.between(before, after).toMillis());
	}

}
