package com.training.ocp.fp.optional;

import java.util.Optional;

/**
 * 
 * @author Pavel Seda
 *
 */
public class QuizOptional {

	public static void main(String[] args) {
		Optional<String> s1 = Optional.<String>of(null);
		if (s1.isPresent()) {
			System.out.println("String is not null");
		} else {
			System.out.println("String is null");
		}
	}
}
