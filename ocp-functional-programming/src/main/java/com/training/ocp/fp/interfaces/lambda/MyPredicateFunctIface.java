package com.training.ocp.fp.interfaces.lambda;

/**
 *
 * @author Pavel Šeda
 * 
 */
@FunctionalInterface
public interface MyPredicateFunctIface<T> {

	boolean test(T t);

}
