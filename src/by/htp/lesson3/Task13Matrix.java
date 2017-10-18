package by.htp.lesson3;

public class Task13Matrix {

	public static void main(String[] args) {

		int[][] matrix = { { 0, 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
		print(matrix);
		System.out.println();
		System.out.println();

		int temp;
		for (int i = 0; i < matrix[0].length; i++) {
			temp = matrix[0][i];
			matrix[0][i] = matrix[1][i];
			matrix[1][i] = temp;
		}

		print(matrix);

	}

	public static void print(int[][] matrix) {
		for (int x : matrix[0]) {
			System.out.print(x + ", ");
		}
		System.out.println();
		for (int x : matrix[1]) {
			System.out.print(x + ", ");
		}
	}

}
