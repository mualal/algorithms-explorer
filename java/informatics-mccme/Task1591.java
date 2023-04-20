import java.util.Scanner;


public class Task1591 {

	public static void output(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int[][] matrix = new int[N][];
		for (int i = 0; i < N; i++) {
			matrix[i] = new int[i + 1];
			matrix[i][i] = 1;
			matrix[i][0] = 1;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length - 1; j++) {
				matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][j - 1];
			}
		}
		output(matrix);
	}
}
