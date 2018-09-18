package com.training.ocp.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @author Pavel Seda
 *
 */
public class PrintStreamPrintWriter {

	public static void main(String[] args) {
		CharacterStreams cs = new CharacterStreams();
		File file = new File(CharacterStreams.class.getClassLoader().getResource("byteStreamInputFile.txt").getFile());

		try {
			printWriter(file);
		} catch (IOException io) {

		}

	}

	private static void printWriter(File file) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(file.getAbsolutePath());
		out.print(5); // PrintWriter method
		out.write(String.valueOf(5)); // Writer method
		out.print(2.0); // PrintWriter method
		out.write(String.valueOf(2.0)); // Writer method

	}
}
