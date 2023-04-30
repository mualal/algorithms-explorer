import java.util.Scanner;


public class Task112614 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		in.close();
		int[][] matrix = new int[N + 11][M + 11];
		matrix[4][4] = 1;
		for (int i = 4; i < N + 4; i++) {
			for (int j = 4; j < M + 4; j++) {
				if (i != 4 || j != 4) {
					matrix[i][j] = matrix[i - 1][j - 2] + matrix[i - 2][j - 1];
				}
			}
		}
		System.out.println(matrix[3 + N][3 + M]);
	}
}
