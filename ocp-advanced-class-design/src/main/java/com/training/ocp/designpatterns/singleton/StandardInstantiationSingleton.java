package com.training.ocp.designpatterns.singleton;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class StandardInstantiationSingleton {

	private static final StandardInstantiationSingleton instance;

	static {
		instance = new StandardInstantiationSingleton();
	}

	private StandardInstantiationSingleton() {
	}

	public static StandardInstantiationSingleton getInstance() {
		return instance;
	}
}
