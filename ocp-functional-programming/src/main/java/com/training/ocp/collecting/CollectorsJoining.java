package com.training.ocp.collecting;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CollectorsJoining {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Pavel", "Zdenka", "Petr", "Magdalena");

		String result = list.stream().collect(Collectors.joining());
		System.out.println(result); // PavelZdenkaPetrMagdalena

		result = list.stream().collect(Collectors.joining(","));
		System.out.println(result); // Pavel,Zdenka,Petr,Magdalena

		result = list.stream().collect(Collectors.joining("-", "[", "]"));
		System.out.println(result); // [Pavel-Zdenka-Petr-Magdalena]

	}
}
