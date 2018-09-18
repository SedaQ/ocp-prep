package com.training.ocp.fp.collecting;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CollectorsPartitioningByExample {

	private static final long SALARY_TO_COMPARE = 60_000;

	public static void main(String[] args) {
		Map<Boolean, List<Employee>> employeesWithHigherSalary = GenerateData.mockedData().stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.partitioningBy(emp -> emp.getSalary() > SALARY_TO_COMPARE));
		System.out.println(employeesWithHigherSalary);
	}

}
