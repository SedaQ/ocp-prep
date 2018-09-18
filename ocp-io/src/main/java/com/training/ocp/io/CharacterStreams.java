package com.training.ocp.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Character I/O usually occurs in bigger units than single characters. One common unit is the line:
 * a string of characters with a line terminator at the end. A line terminator can be a
 * carriage-return/line-feed sequence ("\r\n"), a single carriage-return ("\r"), or a single
 * line-feed ("\n"). Supporting all possible line terminators allows programs to read text files
 * created on any of the widely used operating systems.
 * 
 * 
 * @author Pavel Seda
 *
 */
public class CharacterStreams {

	public static void main(String[] args) {
		CharacterStreams cs = new CharacterStreams();
		File input = new File(CharacterStreams.class.getClassLoader().getResource("byteStreamInputFile.txt").getFile());
		File output = new File(CharacterStreams.class.getClassLoader().getResource("byteStreamOutputFile.txt").getFile());
		try {
			cs.copy(input, output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void copy(File input, File output) throws IOException {
		try (BufferedReader inputStream = new BufferedReader(new FileReader(input));
				PrintWriter outputStream = new PrintWriter(new FileWriter(output));) {
			String l = null;
			while ((l = inputStream.readLine()) != null) {
				System.out.println(l);
				outputStream.println(l);
			}
		}
	}

}
