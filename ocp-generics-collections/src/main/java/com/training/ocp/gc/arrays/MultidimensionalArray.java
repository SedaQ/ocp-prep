package com.training.ocp.gc.arrays;

/**
 * 
 * @author Pavel Seda
 *
 */
public class MultidimensionalArray {

	public static void main(String[] args) {
		multiDimensionalArray();
	}

	/**
	 * <code>
	 *  matrix.length = number of rows
	 *  matrix[i].length = number of columns in particular row
	 * </code>
	 */
	private static void multiDimensionalArray() {
		int[][] matrix = { { 3, 5, 4 }, { 1, 2 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
