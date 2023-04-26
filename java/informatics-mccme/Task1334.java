import java.util.Scanner;


public class Task1334 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int a = 0;
		int b = 0;
		int help = 0;
		int matrix[][] = new int[N][N];
		for (int i = 0; i < M; i++) {
			a = in.nextInt() - 1;
			b = in.nextInt() - 1;
			help = in.nextInt();
			matrix[b][a] = help;
			matrix[a][b] = help;
		}
		in.close();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (matrix[i][j] > matrix[i][k] + matrix[k][j] && matrix[i][k] != Integer.MAX_VALUE
							&& matrix[k][j] != Integer.MAX_VALUE) {
						matrix[i][j] = matrix[i][k] + matrix[k][j];
					}
				}
			}
		}
		int max_length = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] > max_length && i != j && matrix[i][j] != Integer.MAX_VALUE) {
					max_length = matrix[i][j];
				}
			}
		}
		System.out.println(max_length);
	}
}
