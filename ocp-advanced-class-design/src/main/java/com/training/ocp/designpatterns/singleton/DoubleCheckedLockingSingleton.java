package com.training.ocp.designpatterns.singleton;

/**
 * Volatile keyword means that this keyword prevents a subtle case where the
 * compiler tries to optimize the code such that the object is accessed before
 * it is finished being constructed
 *
 * @author Pavel Šeda
 *
 */
public class DoubleCheckedLockingSingleton {

	private static volatile DoubleCheckedLockingSingleton instance;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}
