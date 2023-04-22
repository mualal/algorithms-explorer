import java.util.Scanner;


public class Task461 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		int n = in.nextInt();
		int[][] matrixA = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixA[i][j] = in.nextInt();
			}
		}
		in.close();
		for (int i = 0; i < n; i++) {
			if (matrixA[i][i] == 1) {
				flag = true;
				System.out.println("YES");
				break;
			}
		}
		if (!flag) {
			System.out.println("NO");
		}
	}
}
