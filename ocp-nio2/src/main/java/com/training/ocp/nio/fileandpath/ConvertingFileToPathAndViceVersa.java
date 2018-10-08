package com.training.ocp.nio.fileandpath;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ConvertingFileToPathAndViceVersa {

	public static void main(String[] args) {
		File f1 = new File("/etc/project/settings.prop");
		Path p1 = f1.toPath();

		Path p2 = Paths.get("C:/trainings");
		File f2 = p2.toFile();
	}
}
