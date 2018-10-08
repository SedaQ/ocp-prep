package com.training.ocp.nio.interactingwithfiles;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesExists {

	public static void main(String[] args) {
		boolean exists = Files.exists(Paths.get("C:\\trainings"));
		System.out.println(exists);
	}
}
