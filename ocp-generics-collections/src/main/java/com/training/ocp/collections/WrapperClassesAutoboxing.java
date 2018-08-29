package com.training.ocp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * In case of wrapper classes we must pay special attention about autoboxing and
 * unboxing. This operation is quite heavy and for that reason Java creators
 * make a lot of primitive functional interfaces.
 * 
 * The examples of wrapper classes is shown in the following list:
 * 
 * <ul>
 * <li>boolean -- Boolean -- new Boolean(false)</li>
 * <li>byte -- Byte -- new Byte((byte) 1)</li>
 * <li>short -- Short -- new Short((short) 1)</li>
 * <li>int -- Integer -- new Integer(1)</li>
 * <li>long -- Long -- new Long(1)</li>
 * <li>float -- Float -- new Float(1.0)</li>
 * <li>double -- Double -- new Double(1.0)</li>
 * <li>char -- Character -- new Character('c')</li>
 * </ul>
 * 
 * @author Pavel Seda
 *
 */
public class WrapperClassesAutoboxing {

	public static void main(String[] args) {
		workingWithIndexes();
	}

	/**
	 * What will be printed?
	 */
	public static void workingWithIndexes() {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(new Integer(2));
		nums.add(new Integer(3));
		nums.remove(1);
		nums.remove(new Integer(3));
		System.out.println(nums);
	}

	/**
	 * This method is extremely unefficient, because for each element in myList
	 * array it unboxes the values.
	 */
	public static void unboxingExample() {
		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		for (Integer listItem : myList) {
			int number = listItem; // example of unboxing !!!! WRONG
		}
	}
}
