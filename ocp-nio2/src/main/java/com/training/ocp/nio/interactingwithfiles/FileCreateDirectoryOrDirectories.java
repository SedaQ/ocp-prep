package com.training.ocp.nio.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FileCreateDirectoryOrDirectories {

	public static void main(String[] args) {
		createDirectory();

		createDirectories();
	}

	/**
	 * It creates only one directory (if dir-test exists than it is possible to create dir-test/pavel
	 * directory but not dir-test/pavel/pavel directory
	 */
	private static void createDirectory() {
		try {
			Files.createDirectory(Paths.get("./dir-test"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * It creates all the directories presented in the path (if dir-test exists than it is possible to
	 * create dir-test/pavel/pavel and whatever nested path)
	 */
	private static void createDirectories() {
		try {
			Files.createDirectories(Paths.get("./dir-test/pavel/pavel"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
