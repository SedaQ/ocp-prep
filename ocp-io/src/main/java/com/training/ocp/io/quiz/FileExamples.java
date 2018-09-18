package com.training.ocp.io.quiz;

import java.io.File;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FileExamples {

	public static void main(String[] args) {
		File parent = null;
		File child = new File(parent, "/data/test.txt");
		System.out.println(child.getPath());
	}
}
