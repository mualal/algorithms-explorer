import java.util.Scanner;


public class Task460 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = true;
		int n = in.nextInt();
		int[][] matrixA = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixA[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrixA[i][j] == 1 && i == j) {
					flag = false;
				}
				if (matrixA[i][j] != matrixA[j][i]) {
					flag = false;
				}
			}
		}
		if (flag) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
