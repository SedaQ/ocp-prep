package com.training.ocp.io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * New way of operating with Console since Java 7.
 * 
 * 
 * Do not work in IDE :(
 * 
 * <pre>
 * <code>
 * To compile this app: javac ConsoleExample.java 
 * To run this app: java ConsoleExample
 * </code>
 * </pre>
 * 
 * @author Pavel Seda
 *
 */
public class ConsoleExample {

	public static void main(String[] args) {
		try {
			oldWay();
			newWay();
		} catch (IOException io) {

		}
	}

	private static void oldWay() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		System.out.println("You entered the following input: " + input);
	}

	private static void oldWayScanner() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
	}

	private static void newWay() {
		Console console = System.console();
		if (console != null) {
			System.out.println("Your username please.");
			String username = console.readLine();
			System.out.println("Your password please.");
			char[] password = console.readPassword();
		}
	}
}
