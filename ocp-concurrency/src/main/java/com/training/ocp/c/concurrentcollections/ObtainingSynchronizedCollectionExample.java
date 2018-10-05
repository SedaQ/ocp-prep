package com.training.ocp.c.concurrentcollections;

import java.util.*;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ObtainingSynchronizedCollectionExample {

	public static void main(String[] args) {
		Map<Integer, String> employees = new HashMap<>();
		employees.put(1, "pavel");
		employees.put(2, "petr");
		Map<Integer, String> employeesSync = Collections.synchronizedMap(employees);
		for (Integer key : employeesSync.keySet())
			employeesSync.remove(key);
	}
}
