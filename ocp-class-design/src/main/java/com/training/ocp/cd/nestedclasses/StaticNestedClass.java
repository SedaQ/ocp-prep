package com.training.ocp.cd.nestedclasses;

/**
 *
 * Static Nested classes have the following properties:
 * 
 * <ul>
 * <li>The nesting creates a namespace because the enclosing class name must be
 * used to refer to it.</li>
 * <li>It can be made private or use one of the other access modifiers to
 * encapsulate it.</li>
 * <li>The enclosing class can refer to the fields and methods of the static
 * nested class.</li>
 * </ul>
 * 
 * Static classes could be imported using static import;
 * 
 * @author Pavel Šeda
 *
 */
public class StaticNestedClass {

	static class Nested {
		private int salary = 100_000;

		public static void main(String[] args) {
			// could be instantiated without outer class
			Nested nested = new Nested();
			System.out.println(nested.salary);
		}
	}
}
