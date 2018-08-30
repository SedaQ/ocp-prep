package com.training.ocp.interfaces.lambda;

/**
 *
 * @author Pavel Šeda
 * 
 */
@FunctionalInterface
public interface MyPredicateFunctIface<T> {

	boolean test(T t);

}
