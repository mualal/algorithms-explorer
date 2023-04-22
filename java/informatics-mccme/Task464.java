import java.util.Scanner;


public class Task464 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int help = 0;
		int n = in.nextInt();
		int[][] matrixA = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixA[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < n; i++) {
			help++;
			for (int j = help; j < n; j++) {
				if (matrixA[i][j] == 1)
					System.out.println((i + 1) + " " + (j + 1));
			}
		}
	}
}
