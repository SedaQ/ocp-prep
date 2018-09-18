package com.training.ocp.fp.buildinfunctionalinterfaces.consumer;

import java.util.function.Consumer;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ConsumerExample {

	public static void main(String[] args) {
		print();
	}

	private static void print() {
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);

		c1.accept("Pavel");
		c2.accept("Petr");
	}

}
