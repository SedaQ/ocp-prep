package com.training.ocp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Working with single strings, usually reading line by line or writing line by line.
 * 
 * @author Pavel Seda
 *
 */
public class BufferedReaderWriter {

	public static void main(String[] args) {
		File input = new File(BufferedByteStreams.class.getClassLoader().getResource("employees-input.txt").getFile());
		File output = new File(BufferedByteStreams.class.getClassLoader().getResource("employees-output.txt").getFile());

		BufferedReaderWriter bbs = new BufferedReaderWriter();
		try {
			bbs.copy(input, output);
			// bbs.readFile(input);
			List<String> employees = bbs.readFileFactoryMethod(input);
			employees.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void copy(File input, File output) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(input)); BufferedWriter bw = new BufferedWriter(new FileWriter(output));) {
			String line = null;
			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.flush();
			}
		}
	}

	private List<String> readFile(File input) throws IOException {
		List<String> data = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			String s;
			while ((s = br.readLine()) != null) {
				data.add(s);
			}
		}
		return data;
	}

	private List<String> readFileFactoryMethod(File input) throws IOException {
		List<String> data = new ArrayList<>();
		try (BufferedReader br = Files.newBufferedReader(input.toPath())) {
			String s;
			while ((s = br.readLine()) != null) {
				data.add(s);
			}
		}
		return data;
	}

}
