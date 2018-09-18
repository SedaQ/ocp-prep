package com.training.ocp.fp.collecting;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CollectorsMapping {

	public static void main(String[] args) {
		List<String> employeeNames = GenerateData.mockedData().stream()
				.collect(Collectors.mapping(Employee::getName, Collectors.toList()));
		System.out.println(employeeNames);
	}

}
