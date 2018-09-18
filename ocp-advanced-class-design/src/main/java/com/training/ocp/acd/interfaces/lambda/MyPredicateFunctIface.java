package com.training.ocp.acd.interfaces.lambda;

/**
 *
 * @author Pavel Šeda
 * 
 */
@FunctionalInterface
public interface MyPredicateFunctIface<T> {

	boolean test(T t);

}
