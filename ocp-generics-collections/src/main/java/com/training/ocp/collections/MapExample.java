package com.training.ocp.collections;

import java.util.*;

/**
 * A map is a collection that maps keys to values, with no duplicate keys
 * allowed. The elements in a map are key/value pairs.
 * 
 * @author Pavel Seda
 *
 */
public class MapExample {

	public static void main(String[] args) {
		hashMap();

		System.out.println();

		treeMap();

		System.out.println();

		hashtable();
	}

	/**
	 * Use hashMap when you need speed, but you do not care about ordering.
	 */
	private static void hashMap() {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "1 value");
		hashMap.put(2, "2 value");
		hashMap.put(4, "4 value");
		hashMap.put(8, "8 value");
		hashMap.put(9, null);

		hashMap.containsKey(1);
		hashMap.containsValue("1 value");

		for (Map.Entry<Integer, String> entry : hashMap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

	/**
	 * Use TreeMap when you need elements somehow sorted.
	 * 
	 * TreeMap does not allow null keys.
	 */
	private static void treeMap() {
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "1 value");
		treeMap.put(2, "2 value");
		treeMap.put(4, "4 value");
		treeMap.put(8, "8 value");
		treeMap.put(9, null);

		for (Map.Entry<Integer, String> entry : treeMap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		// treeMap.forEach((k, v) -> System.out.println(k + " " + v));
	}

	/**
	 * Hashtable is synchronized. It is thread-safe and can be shared with many
	 * threads.
	 * 
	 * If you do not need thread-safe behaviour prefer HashMap over Hashtable.
	 * 
	 * Hashtable does not allow null keys or values.
	 * 
	 */
	private static void hashtable() {
		Map<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "1 value");
		hashtable.put(2, "2 value");
		hashtable.put(3, "2 value");
		hashtable.put(4, "4 value");
		hashtable.put(8, "8 value");
		hashtable.forEach((k, v) -> System.out.println("Key = " + k + " " + ", Value = " + v));

//		hashtable.put(1, null);
	}

}
