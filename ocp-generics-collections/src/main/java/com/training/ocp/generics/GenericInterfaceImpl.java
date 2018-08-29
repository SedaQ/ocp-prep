package com.training.ocp.generics;

/**
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
