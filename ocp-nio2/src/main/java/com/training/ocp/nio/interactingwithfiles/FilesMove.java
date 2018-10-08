package com.training.ocp.nio.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesMove {

	public static void main(String[] args) {
		// renameFile();

		moveFile();
	}

	private static void renameFile() {
		try {
			Files.move(Paths.get("./src/main/resources/test-files/file-to-move.txt"),
					Paths.get("./src/main/resources/test-files/file-to-move.txt"));
		} catch (IOException io) {
		}
	}

	private static void moveFile() {
		try {
			Files.move(Paths.get("./src/main/resources/test-files/file-to-move.txt"),
					Paths.get("./src/main/resources/copy-directory/file-to-move-moved.txt"));
		} catch (IOException io) {
		}
	}
}
