package com.training.ocp.ea.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author Pavel Seda
 *
 */
public class AutocloseableTryWithResourcesExample {

	static class AutoImpl implements AutoCloseable {
		@Override
		public void close() {// something

		}
	}

	public static void main(String[] args) {
		Path p1 = Paths.get("test-read.txt");
		Path p2 = Paths.get("test-write.txt");

		newApproach(p1, p2);
	}

	/**
	 * New approach which uses try-with-resources block (everything in
	 * try-with-resources have to implement Autocloseable interface). This block
	 * takes care resource management automatically (it closes streams in the
	 * reverse order).
	 * 
	 * See we add AutoImpl to the try-with-resources and everything is OK because it
	 * is implementing AutoCloseable interface if we would add, e.g. some String
	 * instance then it will not compile because String is not implementing
	 * AutoCloseable interface.
	 * 
	 * @param path1 Path to a file to read something
	 * @param path2 Path to a file to write data from text from path1
	 */
	private static void newApproach(Path path1, Path path2) {
		try (BufferedReader br = Files.newBufferedReader(path1);
				BufferedWriter bw = Files.newBufferedWriter(path2);
				AutoImpl impl = new AutoImpl();) {
			bw.write(br.readLine());
		} catch (IOException io) {
			// handle io exceptions
		}
	}

}
