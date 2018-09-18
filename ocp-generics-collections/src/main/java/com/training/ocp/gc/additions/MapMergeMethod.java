package com.training.ocp.gc.additions;

import java.util.*;

/**
 * 
 * Merge the specified value to the existing Value using the Specified function
 * for the Specified Key.
 * 
 * If the Key is not present , Add an element with the new Key and Value.
 * 
 * 
 * @author Pavel Seda
 *
 */
public class MapMergeMethod {

	public static void main(String[] args) {
		mergeOnExistingKey();

		System.out.println(System.lineSeparator());

		mergeOnNonExistingKey();
	}

	/**
	 * Here "Key1" exists, so it will invoke mapper function and merge specific
	 * value to the existing value.
	 */
	private static void mergeOnExistingKey() {
		Map<String, String> strMap = new HashMap<String, String>();
		strMap.put("Key1", "Value1");
		strMap.put("Key2", "Value2");
		String str = strMap.merge("Key1", "Value56", (v1, v2) -> v1.substring(3).concat(v2));
		System.out.println(str); // prints ue1Value56
		System.out.println(strMap); // prints {Key2=Value2, Key1=ue1Value56}

	}

	/**
	 * Here the "Key4" is not existing, so it just add new combination Key4 and
	 * Value56 to the map.
	 */
	private static void mergeOnNonExistingKey() {
		Map<String, String> strMap = new HashMap<String, String>();
		strMap.put("Key1", "Value1");
		strMap.put("Key2", "Value2");
		String str = strMap.merge("Key4", "Value56", (v1, v2) -> v1.substring(3).concat(v2));
		System.out.println(str); // prints Value56
		System.out.println(strMap); // prints {Key2=Value2, Key1=Value1, Key4=Value56}
	}
}
