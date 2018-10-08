package com.training.ocp.nio.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesDelete {

	public static void main(String[] args) {
		try {
			Files.delete(Paths.get("./src/main/resources/copy-directory/file-to-move-moved.txt"));
			Files.deleteIfExists(Paths.get("./src/main/resources/copy-directory/file-to-move-moved.txt"));
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
