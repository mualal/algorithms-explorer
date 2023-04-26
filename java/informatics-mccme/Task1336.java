import java.util.Scanner;


public class Task1336 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int S = in.nextInt();
		int E = in.nextInt();
		double[][] matrix = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = 1000000;
			}
		}
		for (int i = 0; i < M; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			double c = in.nextDouble() / 100;
			matrix[a][b] = c;
			matrix[b][a] = c;
		}
		in.close();

		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (matrix[i][j] > 1 - (1 - matrix[i][k]) * (1 - matrix[k][j]) && matrix[i][k] != 1000000
							&& matrix[k][j] != 1000000) {
						matrix[i][j] = 1 - (1 - matrix[i][k]) * (1 - matrix[k][j]);
					}
				}
			}
		}
		System.out.println(matrix[S - 1][E - 1]);
	}
}
