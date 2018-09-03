package com.training.ocp.buildinfunctionalinterfaces.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BiConsumerExample {

	public static void main(String[] args) {
		putToMap();
		forEachMap();
	}

	/**
	 * As you see the code for b1 is a good bit shorter than code for b2. This is
	 * probably the reason why the exam is GDso fond of method references.
	 */
	private static void putToMap() {
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> b1 = map::put;
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

		b1.accept("Pavel", 183);
		b2.accept("Petr", 171);

		System.out.println(map);
	}

	private static void forEachMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Key:" + key + " Value:" + value);
		map.forEach(biConsumer);

	}

}
