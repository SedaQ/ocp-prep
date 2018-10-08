package com.training.ocp.nio.interactingwithfiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesNewBufferedReader {

	public static void main(String[] args) {
		Path path = Paths.get("./src/main/resources/test-files/file-to-read.txt");
		try (BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))) {
			String currentLine = null;
			while ((currentLine = reader.readLine()) != null)
				System.out.println(currentLine);
		} catch (IOException e) {
		}
	}
}
