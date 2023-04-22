import java.util.Scanner;


public class Task465 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] matrixA = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixA[i][j] = 0;
			}
		}
		for (int i = 0; i < m; i++) {
			a = in.nextInt() - 1;
			b = in.nextInt() - 1;
			matrixA[a][b] = 1;
			matrixA[b][a] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
