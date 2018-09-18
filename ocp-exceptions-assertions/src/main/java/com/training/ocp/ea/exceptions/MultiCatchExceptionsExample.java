package com.training.ocp.ea.exceptions;

import java.io.*;
import java.nio.file.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MultiCatchExceptionsExample {

	public static void main(String[] args) {
	}

	private static void multipleCatchClause() {
		try {
			Path path = Paths.get("Test.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate ld = LocalDate.parse(text);
			System.out.println(ld);
		} catch (DateTimeParseException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static void multipleCatchClauseChained() {
		try {
			Path path = Paths.get("Test.txt");
			String text = new String(Files.readAllBytes(path));
			LocalDate ld = LocalDate.parse(text);
			System.out.println(ld);
		} catch (DateTimeParseException | IOException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Discussing valid and invalid multi-catch exceptions.
	 */
	private static void testMethod() {
		// try {
		// someMethod();
		// } catch (FileNotFoundException | IllegalStateException e) {
		// } catch (InputMismatchException e | MissingResourceException e) {
		// } catch (SQLException | ArrayIndexOutOfBoundsException e) {
		// } catch (FileNotFoundException | IllegalArgumentException e) {
		// } catch (Exception e) {
		// } catch (IOException e) {
		// }
	}

	private static void someMethod() throws DateTimeParseException, IOException {
	}
}
