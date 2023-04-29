import java.util.Scanner;


public class Task112612 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N][M];
		int[] array = new int[N * M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		int z = N * M;
		for (int j = 1; j < M; j++) {
			matrix[0][j] += matrix[0][j - 1];
		}
		for (int i = 1; i < N; i++) {
			matrix[i][0] += matrix[i - 1][0];
		}
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < M; j++) {
				matrix[i][j] += Math.max(matrix[i - 1][j], matrix[i][j - 1]);
			}
		}
		System.out.println(matrix[N - 1][M - 1]);
		int i = N - 1;
		int j = M - 1;
		N = 0;
		while (i != 0 && j != 0) {
			if (Math.max(matrix[i - 1][j], matrix[i][j - 1]) == matrix[i - 1][j]) {
				array[N] = 1;
				i--;
			} else {
				array[N] = 2;
				j--;
			}
			N++;
		}
		for (int k = 0; k < Math.max(i, j); k++) {
			if (i == 0) {
				System.out.print("R");
			} else {
				System.out.print("D");
			}
		}
		for (int k = z - 1; k >= 0; k--) {
			if (array[k] == 1) {
				System.out.print("D");

			}
			if (array[k] == 2) {
				System.out.print("R");
			}
		}
	}
}
