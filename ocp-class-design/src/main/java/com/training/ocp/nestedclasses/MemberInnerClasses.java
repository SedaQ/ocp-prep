package com.training.ocp.nestedclasses;

/**
 * Member inner classes have the following properties:
 * 
 * <ul>
 * <li>Can be declared public, private, or protected or use default access</li>
 * <li>Can extend any class and implement interfaces</li>
 * <li>Can be abstract or final</li>
 * <li>Cannot declare static fields or method</li>
 * <li>Can access members of the outer class including private members</li>
 * </ul>
 * 
 * After compiling this code it will generate two class files:
 * 
 * <pre>
	 <code>
	 	MemberInnerClasses.class
	 	MemberInnerClasses$Inner.class
	 </code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class MemberInnerClasses {

	private String someString = "Outer";

	/**
	 * A member inner class declaration looks just like a stand‐alone class
	 * declaration except that it happens to be located inside another class
	 */
	protected class Inner {
		public void goThrough() {
			for (int i = 0; i < 3; i++) {
				System.out.println(someString);
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.goThrough();
	}

	public static void main(String[] args) {
		MemberInnerClasses outer = new MemberInnerClasses();
		Inner inner = new MemberInnerClasses().new Inner(); // must create instance of outer class
		outer.callInner();
		inner.goThrough();
	}
}
