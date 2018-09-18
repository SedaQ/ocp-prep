package com.training.ocp.gc.generics;

/**
 * 
 * There are generally 3 ways how to implement generic interface
 * 
 * Check deleting <String> in GenericInterface. Check how test method will be
 * overriden than etc.
 * 
 * @author Pavel Seda
 *
 */
public class GenericInterfaceImpl implements GenericInterface<String> {
	@Override
	public boolean test(String t) {
		return false;
	}
}

class GenericInterfaceImpl2<U> implements GenericInterface<U> {
	@Override
	public boolean test(U u) {
		return false;
	}
}

/**
 * This is the old way of writing code
 */
class GenericInterfaceImpl3 implements GenericInterface {
	@Override
	public boolean test(Object t) {
		return false;
	}
}
