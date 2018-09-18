package com.training.ocp.io;

import java.io.*;
import java.util.*;

import com.training.ocp.io.emp.Employee;

/**
 * Used for serializing and deserializing Java objects.
 * 
 * @author Pavel Seda
 *
 */
public class ObjectStreams {

	public static void main(String[] args) {
		File file = new File(ObjectStreams.class.getClassLoader().getResource("employees-serialized.txt").getFile());
		try {
			List<Employee> employees = Arrays.asList(new Employee("pavel@email", "pavel", 5), new Employee("karel@email.cz", "karel", 15));
			ObjectStreams.writeObject(employees, file);

			// List<Employee> emp = ObjectStreams.readObject(file);
			// emp.forEach(System.out::println);
		} catch (IOException io) {

		}
	}

	public static List<Employee> readObject(File input) throws IOException, ClassNotFoundException {
		List<Employee> employees = new ArrayList<Employee>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(input)))) {
			while (true) {
				Object object = in.readObject();
				if (object instanceof Employee)
					employees.add((Employee) object);
			}
		}
	}

	public static void writeObject(List<Employee> employees, File output) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(output)))) {
			for (Employee emp : employees) {
				out.writeObject(emp);
			}
		}
	}
}
