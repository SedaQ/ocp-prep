package com.training.ocp.acd.designpatterns.singleton;

/**
 *
 * @author Pavel Šeda
 *
 */
public class LazyInstantiationSingleton {

	private static LazyInstantiationSingleton instance;

	private LazyInstantiationSingleton() {
	}

	public static LazyInstantiationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInstantiationSingleton(); // NOT THREAD-SAFE
		}
		return instance;
	}

}
