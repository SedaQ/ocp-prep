package com.training.ocp.nio.pathcreate;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class CreatingPathClass {

	public static void main(String[] args) {}

	public static void systemFiles() {
		Path p1 = Paths.get("C:/trainings");
		Path p2 = Paths.get("C:\\trainings");
		Path p3 = Paths.get("/etc/project/settings.prop");
		// p3 is the same object as the path 4 using different Paths constructor
		Path p4 = Paths.get("/", "etc", "project", "settings.prop");
	}

	public static void usingFileSystemFactoryMethod() {
		Path p1 = FileSystems.getDefault().getPath("C:/trainings");
		Path p2 = FileSystems.getDefault().getPath("/etc/project/settings.prop");
	}

	public static void externalFiles() {
		try {
			Path p1 = Paths.get(new URI("file:///home/project/settings.prop"));
			Path p2 = Paths.get(new URI("http://www.gopas.cz"));
			Path p3 = Paths.get(new URI("ftp://username:password@gopas-ftp-server.cz"));
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
