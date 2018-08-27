package com.training.ocp.nestedclasses;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MemberInnerClassesNestedDeeply {
	private int x = 10;

	class B {
		private int x = 20;

		class C {
			private int x = 30;

			public void allTheX() {
				System.out.println(x); // 30
				System.out.println(this.x); // 30
				System.out.println(B.this.x); // 20
				System.out.println(MemberInnerClassesNestedDeeply.this.x); // 10
			}
		}
	}

	/**
	 * It is possible to have private interfaces here.
	 */
	private interface SomeInterface {
		public void someMethod();
	}

	class SomeInterfaceImpl implements SomeInterface {
		@Override
		public void someMethod() {
		}
	}

	public static void main(String[] args) {
		MemberInnerClassesNestedDeeply a = new MemberInnerClassesNestedDeeply();
		MemberInnerClassesNestedDeeply.B b = a.new B();
		MemberInnerClassesNestedDeeply.B.C c = b.new C();
		c.allTheX();
	}
}
