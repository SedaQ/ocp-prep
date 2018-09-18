package com.training.ocp.sd.strings;

/**
 * 
 * String Pool in java is a pool of Strings stored in Java Heap Memory. We know
 * that String is special class in java and we can create String object using
 * new operator as well as providing values in double quotes.
 * 
 * String Pool is possible only because String is immutable in Java and it’s
 * implementation of String interning concept.
 * 
 * String pool helps in saving a lot of space for Java Runtime although it takes
 * more time to create the String.
 * 
 * When we use double quotes to create a String, it first looks for String with
 * same value in the String pool, if found it just returns the reference else it
 * creates a new String in the pool and then returns the reference.
 * 
 * @author Pavel Seda
 *
 */
public class StringPoolExample {

	public static void main(String[] args) {
		String s1 = "John";
		String s2 = "John";
		String s3 = new String("John");
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true
	}
}
