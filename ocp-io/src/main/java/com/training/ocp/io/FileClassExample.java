package com.training.ocp.io;

import java.io.File;

/**
 * 
 * @author Pavel Seda
 *
 */
public class FileClassExample {

	public static void main(String[] args) {
		FileClassExample fc = new FileClassExample();
		fc.obtainingFileWithFileClass();
		fc.parentChild();

	}

	private void obtainingFileWithFileClass() {
		File f1 = new File(getClass().getClassLoader().getResource("data.txt").getFile());
		if (f1.exists()) {
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getTotalSpace());
			System.out.println(f1.getFreeSpace());
			System.out.println(f1.getParentFile());
			System.out.println(f1.getName());
			System.out.println(f1.getUsableSpace());
			System.out.println(f1.isDirectory());
			if (f1.isFile()) {
				System.out.println(f1.lastModified());
			}
		}
	}

	private void parentChild() {
		File parent = new File("C:/user");
		File child = new File(parent, "/seda/pepa");
		// child path = C:/user/seda/pepa
	}

}
