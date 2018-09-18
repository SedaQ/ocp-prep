package com.training.ocp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class BufferedByteStreams {

	public static void main(String[] args) {
		File input = new File(BufferedByteStreams.class.getClassLoader().getResource("byteStreamInputFile.txt").getFile());
		File output = new File(BufferedByteStreams.class.getClassLoader().getResource("byteStreamOutputFile.txt").getFile());

		BufferedByteStreams bbs = new BufferedByteStreams();
		try {
			bbs.copyBytesAutocloseable(input, output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void copyBytesAutocloseable(File input, File output) throws IOException {
		try (InputStream in = new BufferedInputStream(new FileInputStream(input));
				OutputStream out = new BufferedOutputStream(new FileOutputStream(output));) {
			byte[] buffer = new byte[1024];
			int bytesToRead;
			while ((bytesToRead = in.read(buffer)) != -1) {
				System.out.println(bytesToRead);
				out.write(buffer, 0, bytesToRead);
				out.flush();
			}
		}
	}

}
