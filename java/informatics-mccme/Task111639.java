import java.util.Scanner;


public class Task111639 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int help_1;
		int[][] matrix = new int[N][N];
		for (int i = 1; i <= N; i++) {
			help_1 = in.nextInt();
			for (int j = 1; j <= help_1; j++) {
				matrix[i - 1][in.nextInt() - 1] = 1;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}
}
