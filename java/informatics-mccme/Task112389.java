import java.util.Scanner;


public class Task112389 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		return (matrix);
	}

	public static void output(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix_1 = input();
		int[][] matrix_2 = new int[matrix_1[0].length][matrix_1.length];
		for (int i = 0; i < matrix_2.length; i++) {
			for (int j = 0; j < matrix_2[i].length; j++) {
				matrix_2[i][j] = matrix_1[j][i];
			}
		}
		output(matrix_2);
	}
}
