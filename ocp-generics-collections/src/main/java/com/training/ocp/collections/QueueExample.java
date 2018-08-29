package com.training.ocp.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * A queue is a collection that orders its elements in a specific order for
 * processing. A typical queue processes its elements in a first-in, first-out
 * order, but other orderings are possible.
 * 
 * @author Pavel Seda
 *
 */
public class QueueExample {

	public static void main(String[] args) {

	}

	/**
	 * LinkedList implements both List and Queue interfaces. It has all of the
	 * methods fo a List and also additional (due to implementing Queue interface)
	 * like adding or removing elements from the beginning or from the end of the
	 * set.
	 * 
	 */
	public static void linkedListExample() {
		List<String> s1 = new LinkedList<>();
		Queue<String> s2 = new LinkedList<>();

		s2.add("s1");
		s2.poll(); // removes and returns next element
		s2.peek(); // returns next element
	}

	/**
	 * The main benefit of a LinkedList is that it implements both the List and
	 * Queue interfaces. The tradeoff is that it isn’t as efficient as a "pure"
	 * queue.
	 * 
	 * An ArrayDeque is a "pure" double-ended queue. It was introduced in Java 6,
	 * and it stores its elements in a resizable array.
	 * 
	 * The difference between poll and pop is that pop() returns null if queue is
	 * empty while poll throws and exception if empty queue.
	 * 
	 * ArrayDeque does not allow null elements.
	 */
	public static void arrayDequeExample() {
		Queue<String> linkedList = new ArrayDeque<>();
		Deque<String> stack = new ArrayDeque<>();
		stack.push("s2"); // adds am element to the front of the queue
		stack.push("s3");
		stack.peek();

		stack.poll(); // removes and returns next element
		stack.pop(); // removes and returns next element
	}

}
