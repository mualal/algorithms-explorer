import java.util.Scanner;


public class Task479 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int help_1;
		int help_2;
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < m; i++) {
			help_1 = in.nextInt();
			help_2 = in.nextInt();
			matrix[help_1 - 1][help_2 - 1] = 1;
			matrix[help_2 - 1][help_1 - 1] = 1;
		}
		in.close();
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int z = 0; z < n; z++) {
					if (matrix[i][j] == 1 && matrix[j][z] == 1 && matrix[i][z] != 1 && i != z) {
						flag = false;
					}
				}
			}
		}
		if (flag)
			System.out.println("YES");
		else {
			System.out.println("NO");
		}
	}
}
