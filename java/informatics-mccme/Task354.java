import java.util.Scanner;


public class Task354 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int[][] matrixA = new int[n][n];
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				if (i + j == n - 1) {
					matrixA[i][j] = 1;
				}
				if (i + j > n - 1) {
					matrixA[i][j] = 2;
				}
			}
		}
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
	}
}
