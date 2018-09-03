package com.training.ocp.primitivestreams;

import java.util.stream.DoubleStream;

/**
 * Pay attention that DoubleStream does not contain range or rangeClosed method
 * (it makes perfect sense).
 * 
 * @author Pavel Seda
 *
 */
public class DoubleStreamExample {

	public static void main(String[] args) {
		DoubleStream ds = DoubleStream.of(1.0, 2.0);
		ds.filter(num -> num == 1.0).forEach(System.out::println);
	}
}
