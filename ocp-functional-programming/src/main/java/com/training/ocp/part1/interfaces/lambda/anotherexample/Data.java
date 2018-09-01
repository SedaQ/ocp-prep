package com.training.ocp.part1.interfaces.lambda.anotherexample;

import java.util.*;
import java.util.function.Predicate;

/**
 * 
 * @author Pavel Seda
 *
 */
public class Data {
	private int value;

	public Data(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void printUsefulData(List<Data> dataList, Predicate<Data> p) {
		for (Data d : dataList) {
			if (p.test(d))
				System.out.print(d.value + " ");
		}
	}

}
