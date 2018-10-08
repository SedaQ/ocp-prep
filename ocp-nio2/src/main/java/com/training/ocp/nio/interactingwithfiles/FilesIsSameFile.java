package com.training.ocp.nio.interactingwithfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FilesIsSameFile {

	public static void main(String[] args) {
		try {
			System.out.println(Files.isSameFile(Paths.get("/usr/lib/jvm/java"), Paths.get("/usr/lib/jvm/java")));
			System.out.println(Files.isSameFile(Paths.get("/usr/lib/jvm/java"), Paths.get("/usr/lib/jvm/jvm/../java")));
			System.out.println(Files.isSameFile(Paths.get("/usr/./java"), Paths.get("/usr/java")));
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
