package com.training.ocp.part1.interfaces.lambda;

/**
 *
 * @author Pavel Šeda
 * 
 */
@FunctionalInterface
public interface MyPredicateFunctIface<T> {

	boolean test(T t);

}
