package com.training.ocp.nio.pathmethods;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PathMethods {

	public static void main(String[] args) {
		toStringPath();

		System.out.println();

		getNameCountAndGetName();

		System.out.println();

		getParent();

		System.out.println();

		getRoot();

		System.out.println();

		getFileName();

		System.out.println();

		isAbsolute();

		System.out.println();

		toAbsolutePath();

		System.out.println();

		subPath();

		System.out.println();

		relativize();

		System.out.println();

		resolve();

		System.out.println();

		normalize();

		System.out.println();

		toRealPath();
	}

	private static void toStringPath() {
		Path p1 = Paths.get("/home/trainings");
		// automatically invokes toString() method
		System.out.println("Name of the path is: " + p1);
	}

	private static void getNameCountAndGetName() {
		Path p1 = Paths.get("/home/trainings");
		for (int i = 0; i < p1.getNameCount(); i++) {
			System.out.println("Element " + i + " is: " + p1.getName(i));
		}
	}

	private static void getParent() {
		Path p1 = Paths.get("/home/trainings.txt");
		System.out.println(p1.getParent());
	}

	private static void getRoot() {
		Path p1 = Paths.get("/home/trainings.txt");
		System.out.println(p1.getRoot());
	}

	private static void getFileName() {
		Path p1 = Paths.get("/home/trainings.txt");
		System.out.println(p1.getFileName());
	}

	private static void isAbsolute() {
		Path p1 = Paths.get("C:\\trainings");
		System.out.println("This path is absolute: " + p1.isAbsolute());
	}

	private static void toAbsolutePath() {
		Path p1 = Paths.get("trainings.txt");
		System.out.println(p1.toAbsolutePath());
	}

	private static void subPath() {
		Path path = Paths.get("C:\\trainings\\java\\path.image");
		System.out.println("Path is: " + path);
		System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
		System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
		System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));
	}

	private static void relativize() {
		Path path1 = Paths.get("trainings.txt");
		Path path2 = Paths.get("holidays.txt");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));

		System.out.println();

		Path path3 = Paths.get("C:\\trainings.txt");
		Path path4 = Paths.get("C:\\trainings\\holidays.txt");
		System.out.println(path3.relativize(path4));
		System.out.println(path4.relativize(path3));
	}

	private static void resolve() {
		final Path p1 = Paths.get("/home/trainings/../holidays");
		final Path p2 = Paths.get("pavel-seda");
		System.out.println(p1.resolve(p2));

		final Path p3 = Paths.get("/home/trainings/../holidays");
		final Path p4 = Paths.get("/home/trainings/");
		System.out.println(p3.resolve(p4));
	}

	private static void normalize() {
		Path p1 = Paths.get("/home/trainings/./holidays/some-directory/../some-file.txt");
		System.out.println(p1.normalize());
	}

	private static void toRealPath() {
		try {
			System.out.println(Paths.get(".").toRealPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
