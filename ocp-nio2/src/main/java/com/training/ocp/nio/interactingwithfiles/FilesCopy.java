package com.training.ocp.nio.interactingwithfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesCopy {

	public static void main(String[] args) {
		copyDirectory();

		copyFiles();
	}

	private static void copyDirectory() {
		try {
			System.out.println(Files.exists(Paths.get("./src/main/resources/copy-directory")));
			Files.copy(Paths.get("./src/main/resources/copy-directory"), Paths.get("./src/main/resources/copy-directory-copied"));
		} catch (IOException io) {
		}
	}

	/**
	 * Possible to use Input/Output streams
	 */
	private static void copyFiles() {
		try (InputStream is = new FileInputStream("./src/main/resources/test-files/file-to-copy.txt");
				OutputStream out = new FileOutputStream("./src/main/resources/test-files/to-output-data.txt")) {
			Files.copy(is, Paths.get("./src/main/resources/test-files/copied-to-this-output-data.txt"));
			Files.copy(Paths.get("./src/main/resources/test-files/file-to-copy.txt"), out);
		} catch (IOException e) {
		}
	}
}
