import java.util.Scanner;


public class Task112611 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		in.close();
		int[][] matrix = new int[N][M];
		for (int j = 0; j < M; j++) {
			matrix[0][j] = 1;
		}
		for (int i = 0; i < N; i++) {
			matrix[i][0] = 1;
		}
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < M; j++) {
				matrix[i][j] = (matrix[i - 1][j] + matrix[i][j - 1]) % 1000007;
			}
		}
		System.out.println(matrix[N - 1][M - 1]);
	}
}
