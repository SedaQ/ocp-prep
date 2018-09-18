package com.training.ocp.fp.collecting;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * Example showing groupingBy function groups employees based on their position
 * 
 * @author Pavel Seda
 *
 */
public class CollectorsGroupingByExample {

	public static void main(String[] args) {
		List<Employee> employees = GenerateData.mockedData();
		Map<String, List<Employee>> employeesOnPosition = employees.stream()
				.collect(Collectors.groupingBy(Employee::getPosition));
	}

}
