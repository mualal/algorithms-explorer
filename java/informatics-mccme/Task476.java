import java.util.Scanner;


public class Task476 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		int m = in.nextInt();
		int k;
		int z;
		for (int i = 0; i < m; i++) {
			k = in.nextInt() - 1;
			z = in.nextInt() - 1;
			matrix[k][z] = 1;
			matrix[z][k] = 1;
		}
		in.close();
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0 && i != j) {
					flag = false;
					break;
				}
			}
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
