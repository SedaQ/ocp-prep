package com.training.ocp.ea.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example of try-catch-finally block with properly closing stream resources.
 * 
 * @author Pavel Seda
 *
 */
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		Path p1 = Paths.get("test-read.txt");
		Path p2 = Paths.get("test-write.txt");

		oldApproach(p1, p2);
	}

	/**
	 * Pay attention that to properly close these two resources you need to wrap it
	 * to two try-catch blocks, because if it is wrapped only to one try catch then
	 * potentially if first throws an exception than the second stream is not
	 * closed.
	 * 
	 * @param path1 Path to a file to read something
	 * @param path2 Path to a file to write data from text from path1
	 */
	private static void oldApproach(Path path1, Path path2) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = Files.newBufferedReader(path1);
			bw = Files.newBufferedWriter(path2);
			bw.write(br.readLine());
		} catch (IOException io) {
			// handle io exceptions
		} finally {
			try {
				br.close();
			} catch (IOException io) {
			}
			try {
				bw.close();
			} catch (IOException io) {
			}
		}
	}

}
