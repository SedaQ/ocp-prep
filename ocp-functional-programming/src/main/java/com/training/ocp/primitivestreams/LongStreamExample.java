package com.training.ocp.primitivestreams;

import java.util.OptionalDouble;
import java.util.stream.LongStream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class LongStreamExample {

	public static void main(String[] args) {
		LongStream ls = LongStream.of(1L, 2L, 3L);
		OptionalDouble od = ls.average();
		System.out.println(od.getAsDouble());
	}

}
