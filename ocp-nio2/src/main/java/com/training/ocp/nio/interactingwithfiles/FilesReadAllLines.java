package com.training.ocp.nio.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesReadAllLines {

	public static void main(String[] args) {
		Path path = Paths.get("./src/main/resources/test-files/file-to-read.txt");
		try {
			List<String> lines;
			lines = Files.readAllLines(path);
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
