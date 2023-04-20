import java.util.Scanner;


public class Task112388 {

	public static int[][] input() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[][] matrix = new int[N + 2][M + 2];
		for (int i = 1; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix[i].length - 1; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][0] = -1;
			matrix[i][matrix[0].length - 1] = -1;
		}
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[0][j] = -1;
			matrix[matrix.length - 1][j] = -1;
		}
		return (matrix);
	}

	public static void main(String[] args) {
		int[][] matrix = input();
		int n = 1;
		matrix[1][1] = 1;
		while (matrix[matrix.length - 2][matrix[0].length - 2] == 0 && n < matrix.length * matrix[0].length) {
			for (int i = 1; i < matrix.length - 1; i++) {
				for (int j = 1; j < matrix[i].length - 1; j++) {
					if (matrix[i][j] == n) {
						if (matrix[i + 1][j] == 0) {
							matrix[i + 1][j] = n + 1;
						}
						if (matrix[i - 1][j] == 0) {
							matrix[i - 1][j] = n + 1;
						}
						if (matrix[i][j - 1] == 0) {
							matrix[i][j - 1] = n + 1;
						}
						if (matrix[i][j + 1] == 0) {
							matrix[i][j + 1] = n + 1;
						}
					}
				}
			}
			n++;
		}

		if (matrix[matrix.length - 2][matrix[0].length - 2] != 0) {
			System.out.println(matrix[matrix.length - 2][matrix[0].length - 2] - 1);
		} else {
			System.out.println(-1);
		}
	}
}
