package com.training.ocp.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Programs use byte streams to perform input and output of 8-bit bytes. All byte stream classes are
 * descended from InputStream and OutputStream.
 * 
 * There are many byte stream classes. To demonstrate how byte streams work, we'll focus on the file
 * I/O byte streams, FileInputStream and FileOutputStream. Other kinds of byte streams are used in
 * much the same way; they differ mainly in the way they are constructed.
 * 
 * @author Pavel Seda
 *
 */
public class ByteStreams {

	public static void main(String[] args) {
		ByteStreams bs = new ByteStreams();
		try {
			// bs.copyBytes();
			bs.copyBytesAutocloseable();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void copyBytes() throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(getClass().getClassLoader().getResource("byteStreamInputFile.txt").getFile());
			out = new FileOutputStream(getClass().getClassLoader().getResource("byteStreamOutputFile.txt").getFile());
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	private void copyBytesAutocloseable() throws IOException {
		try (InputStream in = new FileInputStream(getClass().getClassLoader().getResource("byteStreamInputFile.txt").getFile());
				OutputStream out = new FileOutputStream(getClass().getClassLoader().getResource("byteStreamOutputFile.txt").getFile());) {
			int c;
			while ((c = in.read()) != -1) {
				System.out.println(c);
				out.write(c);
			}
		}
	}

}
