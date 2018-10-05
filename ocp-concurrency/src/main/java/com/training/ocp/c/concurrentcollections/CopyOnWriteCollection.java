package com.training.ocp.c.concurrentcollections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CopyOnWriteCollection {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(1, 3, 5));
		for (Integer item : list) {
			System.out.print(item + " ");
			list.add(1);
		}
		System.out.println();
		System.out.println("Size: " + list.size());
	}
}
