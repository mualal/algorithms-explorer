import java.util.Scanner;


public class Task112622 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] matrix = new int[4][N + 2];
		for (int j = 0; j < N + 2; j++) {
			matrix[0][j] = 1;
		}
		in.close();
		matrix[1][0] = 2;
		matrix[2][0] = 5;
		matrix[3][0] = 10;
		for (int j = 0; j < 4; j++) {
			matrix[j][1] = 1;
		}
		for (int i = 1; i < 4; i++) {
			for (int j = 2; j < N + 2; j++) {
				if (j - 1 < matrix[i][0]) {
					matrix[i][j] = matrix[i - 1][j];
				} else {
					matrix[i][j] = matrix[i - 1][j] + matrix[i][j - matrix[i][0]];
				}
			}
		}
		System.out.println(matrix[3][N + 1]);
	}
}
