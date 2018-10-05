package com.training.ocp.c.concurrentcollections;

import java.util.*;
import java.util.concurrent.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MapQueueDequeExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new ConcurrentHashMap<>();
		map.put("pavel", 40);
		map.put("petr", 43);
		System.out.println(map.get("pavel"));

		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(31);
		System.out.println(queue.peek());
		System.out.println(queue.poll());

		Deque<Integer> deque = new ConcurrentLinkedDeque<>();
		deque.offer(20);
		deque.push(6);
		System.out.println(deque.peek());
		System.out.println(deque.pop());
	}
}
